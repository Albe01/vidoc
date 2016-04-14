package it.vidoc.win.controller;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Textbox;

import it.vidoc.mybatis.javamodel.Elencodocumenti;
import it.vidoc.mybatis.javamodel.User;
import it.vidoc.mybatis.javamodel.Userabilitazioni;
import it.vidoc.mybatis.sqlquery.SqlElencoDocumenti;
import it.vidoc.mybatis.sqlquery.SqlUser;
import it.vidoc.mybatis.sqlquery.SqlUserAbilitazioni;
import it.vidoc.utils.DatiSessione;
import it.vidoc.utils.StringEncrypter;

@SuppressWarnings("rawtypes")
public class WinLoginController extends GenericForwardComposer {
	private static final long serialVersionUID = -4395868321111092273L;
	private Textbox account;
	private Textbox password;
	
	@SuppressWarnings("unchecked")
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		account.setFocus(true);
		
		
//		File pdfFile = new File("d:/temp/640619297.pdf");
//		byte[] pdfData = new byte[(int) pdfFile.length()];
//		DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
//		dis.readFully(pdfData);  // read from file into byte[] array
//		dis.close();
//		Elencodocumenti elencodocumenti = new Elencodocumenti();
//		elencodocumenti.setProgrrigaaccount(99);
//		elencodocumenti.setTipodocumento("pdf");
//		elencodocumenti.setDocumento(pdfData);
////		elencodocumenti.setDocumento(null);
//		elencodocumenti.setDocumento(pdfData);
////		new SqlElencoDocumenti().insertReturnID(elencodocumenti);
//		new SqlElencoDocumenti().insert(elencodocumenti);
		
//		Elencodocumenti where = new Elencodocumenti();
//		where.setProgrriga(elencodocumenti.getProgrriga());
//		
//		elencodocumenti.setProgrriga(null);
//		elencodocumenti.setProgrrigaaccount(null);
//		elencodocumenti.setTipodocumento(null);
//		elencodocumenti.setDocumento(pdfData);
//		new SqlElencoDocumenti().updateByExampleSelective(elencodocumenti, where);
		
	}

	public void onClick$pwdDimenticata(Event event) {
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
		
	}

	public void onClick$serveAiuto(Event event) {
		Clients.showNotification("under construction", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
		
	}

	public void onClick$btnLogin(Event event) {
		String nm = account.getValue();
		String pd = password.getValue();
		it.vidoc.mybatis.javamodel.User user = new User();		
		try {nm = account.getValue();} catch (Exception e) {nm = null;}
		try {pd = password.getValue();} catch (Exception e) {pd = null;}		
		if (!"".equals(nm) &&  !"".equals(pd) && nm != null && pd != null) {
			user = new SqlUser().selectByPrimaryKey(nm);
			String encryptedString;
			try {
				StringEncrypter encrypter =  new StringEncrypter(StringEncrypter.DES_ENCRYPTION_SCHEME, StringEncrypter.DEFAULT_ENCRYPTION_KEY );
				encryptedString = encrypter.encrypt(pd);
			} catch (Exception e) {
				Clients.showNotification("Error in Encrypter", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
				return;
			}
			if(user == null || !user.getPassword().equals(encryptedString)){
				Clients.showNotification("Nome utente e/o password errati.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);				
				return;
			}
		} else {
			Clients.showNotification("Nome utente e/o password omesso.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);			
			return;
		}
		Boolean lockUser = false;
		if (user.getAccountexpired() == true) {
			Clients.showNotification("L'account e' scaduto.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);			
			lockUser = true;
		} else if (user.getAccountlocked() == true) {
			Clients.showNotification("L'account e' bloccato.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
			lockUser = true;
		} else if (user.getCredentialsexpired() == true) {
			Clients.showNotification("Le credenziali sono scadute.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
			lockUser = true;
		} else if (user.getEnabled() == false) {
			Clients.showNotification("Utente non abilitato.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
			lockUser = true;
		}
		if (lockUser == true) {
			return;
		}
		Userabilitazioni userabilitazioni = new Userabilitazioni();
		userabilitazioni.setUsername(nm);
		List<Userabilitazioni> lstUserabilitazioni = new SqlUserAbilitazioni().selectByExample(userabilitazioni, null);
		if (lstUserabilitazioni.size() == 0) {
			Clients.showNotification("Utente privo di abilitazioni.", Clients.NOTIFICATION_TYPE_INFO, null, null, 5000, true);
			return;
		}
		
		Session sess = Sessions.getCurrent();
		DatiSessione datiSessione = new DatiSessione();
		datiSessione.setUser(user);
		datiSessione.setLstUserabilitazioni(lstUserabilitazioni);
		sess.setAttribute("datisessione",datiSessione);
		
		
//		try {
//			Execution exec = Executions.getCurrent();
//		    HttpServletResponse response = (HttpServletResponse)exec.getNativeResponse();
//			response.sendRedirect(response.encodeRedirectURL("/home.zul"));
//			exec.setVoided(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		Executions.sendRedirect("/zulpages/home.zul");
		
	}
}