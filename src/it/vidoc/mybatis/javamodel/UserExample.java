package it.vidoc.mybatis.javamodel;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
	 * @mbggenerated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andCognomeIsNull() {
			addCriterion("cognome is null");
			return (Criteria) this;
		}

		public Criteria andCognomeIsNotNull() {
			addCriterion("cognome is not null");
			return (Criteria) this;
		}

		public Criteria andCognomeEqualTo(String value) {
			addCriterion("cognome =", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeNotEqualTo(String value) {
			addCriterion("cognome <>", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeGreaterThan(String value) {
			addCriterion("cognome >", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeGreaterThanOrEqualTo(String value) {
			addCriterion("cognome >=", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeLessThan(String value) {
			addCriterion("cognome <", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeLessThanOrEqualTo(String value) {
			addCriterion("cognome <=", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeLike(String value) {
			addCriterion("cognome like", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeNotLike(String value) {
			addCriterion("cognome not like", value, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeIn(List<String> values) {
			addCriterion("cognome in", values, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeNotIn(List<String> values) {
			addCriterion("cognome not in", values, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeBetween(String value1, String value2) {
			addCriterion("cognome between", value1, value2, "cognome");
			return (Criteria) this;
		}

		public Criteria andCognomeNotBetween(String value1, String value2) {
			addCriterion("cognome not between", value1, value2, "cognome");
			return (Criteria) this;
		}

		public Criteria andNomeIsNull() {
			addCriterion("nome is null");
			return (Criteria) this;
		}

		public Criteria andNomeIsNotNull() {
			addCriterion("nome is not null");
			return (Criteria) this;
		}

		public Criteria andNomeEqualTo(String value) {
			addCriterion("nome =", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeNotEqualTo(String value) {
			addCriterion("nome <>", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeGreaterThan(String value) {
			addCriterion("nome >", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeGreaterThanOrEqualTo(String value) {
			addCriterion("nome >=", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeLessThan(String value) {
			addCriterion("nome <", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeLessThanOrEqualTo(String value) {
			addCriterion("nome <=", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeLike(String value) {
			addCriterion("nome like", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeNotLike(String value) {
			addCriterion("nome not like", value, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeIn(List<String> values) {
			addCriterion("nome in", values, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeNotIn(List<String> values) {
			addCriterion("nome not in", values, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeBetween(String value1, String value2) {
			addCriterion("nome between", value1, value2, "nome");
			return (Criteria) this;
		}

		public Criteria andNomeNotBetween(String value1, String value2) {
			addCriterion("nome not between", value1, value2, "nome");
			return (Criteria) this;
		}

		public Criteria andSessoIsNull() {
			addCriterion("sesso is null");
			return (Criteria) this;
		}

		public Criteria andSessoIsNotNull() {
			addCriterion("sesso is not null");
			return (Criteria) this;
		}

		public Criteria andSessoEqualTo(String value) {
			addCriterion("sesso =", value, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoNotEqualTo(String value) {
			addCriterion("sesso <>", value, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoGreaterThan(String value) {
			addCriterion("sesso >", value, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoGreaterThanOrEqualTo(String value) {
			addCriterion("sesso >=", value, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoLessThan(String value) {
			addCriterion("sesso <", value, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoLessThanOrEqualTo(String value) {
			addCriterion("sesso <=", value, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoLike(String value) {
			addCriterion("sesso like", value, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoNotLike(String value) {
			addCriterion("sesso not like", value, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoIn(List<String> values) {
			addCriterion("sesso in", values, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoNotIn(List<String> values) {
			addCriterion("sesso not in", values, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoBetween(String value1, String value2) {
			addCriterion("sesso between", value1, value2, "sesso");
			return (Criteria) this;
		}

		public Criteria andSessoNotBetween(String value1, String value2) {
			addCriterion("sesso not between", value1, value2, "sesso");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredIsNull() {
			addCriterion("AccountExpired is null");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredIsNotNull() {
			addCriterion("AccountExpired is not null");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredEqualTo(Boolean value) {
			addCriterion("AccountExpired =", value, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredNotEqualTo(Boolean value) {
			addCriterion("AccountExpired <>", value, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredGreaterThan(Boolean value) {
			addCriterion("AccountExpired >", value, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredGreaterThanOrEqualTo(Boolean value) {
			addCriterion("AccountExpired >=", value, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredLessThan(Boolean value) {
			addCriterion("AccountExpired <", value, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredLessThanOrEqualTo(Boolean value) {
			addCriterion("AccountExpired <=", value, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredIn(List<Boolean> values) {
			addCriterion("AccountExpired in", values, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredNotIn(List<Boolean> values) {
			addCriterion("AccountExpired not in", values, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredBetween(Boolean value1, Boolean value2) {
			addCriterion("AccountExpired between", value1, value2, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountexpiredNotBetween(Boolean value1, Boolean value2) {
			addCriterion("AccountExpired not between", value1, value2, "accountexpired");
			return (Criteria) this;
		}

		public Criteria andAccountlockedIsNull() {
			addCriterion("AccountLocked is null");
			return (Criteria) this;
		}

		public Criteria andAccountlockedIsNotNull() {
			addCriterion("AccountLocked is not null");
			return (Criteria) this;
		}

		public Criteria andAccountlockedEqualTo(Boolean value) {
			addCriterion("AccountLocked =", value, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedNotEqualTo(Boolean value) {
			addCriterion("AccountLocked <>", value, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedGreaterThan(Boolean value) {
			addCriterion("AccountLocked >", value, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("AccountLocked >=", value, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedLessThan(Boolean value) {
			addCriterion("AccountLocked <", value, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedLessThanOrEqualTo(Boolean value) {
			addCriterion("AccountLocked <=", value, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedIn(List<Boolean> values) {
			addCriterion("AccountLocked in", values, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedNotIn(List<Boolean> values) {
			addCriterion("AccountLocked not in", values, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedBetween(Boolean value1, Boolean value2) {
			addCriterion("AccountLocked between", value1, value2, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andAccountlockedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("AccountLocked not between", value1, value2, "accountlocked");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredIsNull() {
			addCriterion("CredentialsExpired is null");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredIsNotNull() {
			addCriterion("CredentialsExpired is not null");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredEqualTo(Boolean value) {
			addCriterion("CredentialsExpired =", value, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredNotEqualTo(Boolean value) {
			addCriterion("CredentialsExpired <>", value, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredGreaterThan(Boolean value) {
			addCriterion("CredentialsExpired >", value, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredGreaterThanOrEqualTo(Boolean value) {
			addCriterion("CredentialsExpired >=", value, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredLessThan(Boolean value) {
			addCriterion("CredentialsExpired <", value, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredLessThanOrEqualTo(Boolean value) {
			addCriterion("CredentialsExpired <=", value, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredIn(List<Boolean> values) {
			addCriterion("CredentialsExpired in", values, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredNotIn(List<Boolean> values) {
			addCriterion("CredentialsExpired not in", values, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredBetween(Boolean value1, Boolean value2) {
			addCriterion("CredentialsExpired between", value1, value2, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andCredentialsexpiredNotBetween(Boolean value1, Boolean value2) {
			addCriterion("CredentialsExpired not between", value1, value2, "credentialsexpired");
			return (Criteria) this;
		}

		public Criteria andEnabledIsNull() {
			addCriterion("Enabled is null");
			return (Criteria) this;
		}

		public Criteria andEnabledIsNotNull() {
			addCriterion("Enabled is not null");
			return (Criteria) this;
		}

		public Criteria andEnabledEqualTo(Boolean value) {
			addCriterion("Enabled =", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledNotEqualTo(Boolean value) {
			addCriterion("Enabled <>", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledGreaterThan(Boolean value) {
			addCriterion("Enabled >", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
			addCriterion("Enabled >=", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledLessThan(Boolean value) {
			addCriterion("Enabled <", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
			addCriterion("Enabled <=", value, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledIn(List<Boolean> values) {
			addCriterion("Enabled in", values, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledNotIn(List<Boolean> values) {
			addCriterion("Enabled not in", values, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
			addCriterion("Enabled between", value1, value2, "enabled");
			return (Criteria) this;
		}

		public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
			addCriterion("Enabled not between", value1, value2, "enabled");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
	 * @mbggenerated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}