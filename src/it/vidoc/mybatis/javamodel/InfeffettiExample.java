package it.vidoc.mybatis.javamodel;

import java.util.ArrayList;
import java.util.List;

public class InfeffettiExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public InfeffettiExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table infeffetti
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table infeffetti
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

		public Criteria andProgrrigaIsNull() {
			addCriterion("progrriga is null");
			return (Criteria) this;
		}

		public Criteria andProgrrigaIsNotNull() {
			addCriterion("progrriga is not null");
			return (Criteria) this;
		}

		public Criteria andProgrrigaEqualTo(Long value) {
			addCriterion("progrriga =", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaNotEqualTo(Long value) {
			addCriterion("progrriga <>", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaGreaterThan(Long value) {
			addCriterion("progrriga >", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaGreaterThanOrEqualTo(Long value) {
			addCriterion("progrriga >=", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaLessThan(Long value) {
			addCriterion("progrriga <", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaLessThanOrEqualTo(Long value) {
			addCriterion("progrriga <=", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaIn(List<Long> values) {
			addCriterion("progrriga in", values, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaNotIn(List<Long> values) {
			addCriterion("progrriga not in", values, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaBetween(Long value1, Long value2) {
			addCriterion("progrriga between", value1, value2, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaNotBetween(Long value1, Long value2) {
			addCriterion("progrriga not between", value1, value2, "progrriga");
			return (Criteria) this;
		}

		public Criteria andDateflussoIsNull() {
			addCriterion("dateflusso is null");
			return (Criteria) this;
		}

		public Criteria andDateflussoIsNotNull() {
			addCriterion("dateflusso is not null");
			return (Criteria) this;
		}

		public Criteria andDateflussoEqualTo(String value) {
			addCriterion("dateflusso =", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoNotEqualTo(String value) {
			addCriterion("dateflusso <>", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoGreaterThan(String value) {
			addCriterion("dateflusso >", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoGreaterThanOrEqualTo(String value) {
			addCriterion("dateflusso >=", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoLessThan(String value) {
			addCriterion("dateflusso <", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoLessThanOrEqualTo(String value) {
			addCriterion("dateflusso <=", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoLike(String value) {
			addCriterion("dateflusso like", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoNotLike(String value) {
			addCriterion("dateflusso not like", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoIn(List<String> values) {
			addCriterion("dateflusso in", values, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoNotIn(List<String> values) {
			addCriterion("dateflusso not in", values, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoBetween(String value1, String value2) {
			addCriterion("dateflusso between", value1, value2, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoNotBetween(String value1, String value2) {
			addCriterion("dateflusso not between", value1, value2, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoIsNull() {
			addCriterion("idflusso is null");
			return (Criteria) this;
		}

		public Criteria andIdflussoIsNotNull() {
			addCriterion("idflusso is not null");
			return (Criteria) this;
		}

		public Criteria andIdflussoEqualTo(String value) {
			addCriterion("idflusso =", value, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoNotEqualTo(String value) {
			addCriterion("idflusso <>", value, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoGreaterThan(String value) {
			addCriterion("idflusso >", value, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoGreaterThanOrEqualTo(String value) {
			addCriterion("idflusso >=", value, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoLessThan(String value) {
			addCriterion("idflusso <", value, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoLessThanOrEqualTo(String value) {
			addCriterion("idflusso <=", value, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoLike(String value) {
			addCriterion("idflusso like", value, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoNotLike(String value) {
			addCriterion("idflusso not like", value, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoIn(List<String> values) {
			addCriterion("idflusso in", values, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoNotIn(List<String> values) {
			addCriterion("idflusso not in", values, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoBetween(String value1, String value2) {
			addCriterion("idflusso between", value1, value2, "idflusso");
			return (Criteria) this;
		}

		public Criteria andIdflussoNotBetween(String value1, String value2) {
			addCriterion("idflusso not between", value1, value2, "idflusso");
			return (Criteria) this;
		}

		public Criteria andRigaIsNull() {
			addCriterion("riga is null");
			return (Criteria) this;
		}

		public Criteria andRigaIsNotNull() {
			addCriterion("riga is not null");
			return (Criteria) this;
		}

		public Criteria andRigaEqualTo(String value) {
			addCriterion("riga =", value, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaNotEqualTo(String value) {
			addCriterion("riga <>", value, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaGreaterThan(String value) {
			addCriterion("riga >", value, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaGreaterThanOrEqualTo(String value) {
			addCriterion("riga >=", value, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaLessThan(String value) {
			addCriterion("riga <", value, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaLessThanOrEqualTo(String value) {
			addCriterion("riga <=", value, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaLike(String value) {
			addCriterion("riga like", value, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaNotLike(String value) {
			addCriterion("riga not like", value, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaIn(List<String> values) {
			addCriterion("riga in", values, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaNotIn(List<String> values) {
			addCriterion("riga not in", values, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaBetween(String value1, String value2) {
			addCriterion("riga between", value1, value2, "riga");
			return (Criteria) this;
		}

		public Criteria andRigaNotBetween(String value1, String value2) {
			addCriterion("riga not between", value1, value2, "riga");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table infeffetti
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
     * This class corresponds to the database table infeffetti
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 18 09:27:24 CEST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}