package com.offcn.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBtitleIsNull() {
            addCriterion("btitle is null");
            return (Criteria) this;
        }

        public Criteria andBtitleIsNotNull() {
            addCriterion("btitle is not null");
            return (Criteria) this;
        }

        public Criteria andBtitleEqualTo(String value) {
            addCriterion("btitle =", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotEqualTo(String value) {
            addCriterion("btitle <>", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleGreaterThan(String value) {
            addCriterion("btitle >", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleGreaterThanOrEqualTo(String value) {
            addCriterion("btitle >=", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLessThan(String value) {
            addCriterion("btitle <", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLessThanOrEqualTo(String value) {
            addCriterion("btitle <=", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLike(String value) {
            addCriterion("btitle like", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotLike(String value) {
            addCriterion("btitle not like", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleIn(List<String> values) {
            addCriterion("btitle in", values, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotIn(List<String> values) {
            addCriterion("btitle not in", values, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleBetween(String value1, String value2) {
            addCriterion("btitle between", value1, value2, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotBetween(String value1, String value2) {
            addCriterion("btitle not between", value1, value2, "btitle");
            return (Criteria) this;
        }

        public Criteria andTypeFkIsNull() {
            addCriterion("type_fk is null");
            return (Criteria) this;
        }

        public Criteria andTypeFkIsNotNull() {
            addCriterion("type_fk is not null");
            return (Criteria) this;
        }

        public Criteria andTypeFkEqualTo(Integer value) {
            addCriterion("type_fk =", value, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkNotEqualTo(Integer value) {
            addCriterion("type_fk <>", value, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkGreaterThan(Integer value) {
            addCriterion("type_fk >", value, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_fk >=", value, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkLessThan(Integer value) {
            addCriterion("type_fk <", value, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkLessThanOrEqualTo(Integer value) {
            addCriterion("type_fk <=", value, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkIn(List<Integer> values) {
            addCriterion("type_fk in", values, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkNotIn(List<Integer> values) {
            addCriterion("type_fk not in", values, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkBetween(Integer value1, Integer value2) {
            addCriterion("type_fk between", value1, value2, "typeFk");
            return (Criteria) this;
        }

        public Criteria andTypeFkNotBetween(Integer value1, Integer value2) {
            addCriterion("type_fk not between", value1, value2, "typeFk");
            return (Criteria) this;
        }

        public Criteria andUFkIsNull() {
            addCriterion("u_fk is null");
            return (Criteria) this;
        }

        public Criteria andUFkIsNotNull() {
            addCriterion("u_fk is not null");
            return (Criteria) this;
        }

        public Criteria andUFkEqualTo(Integer value) {
            addCriterion("u_fk =", value, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkNotEqualTo(Integer value) {
            addCriterion("u_fk <>", value, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkGreaterThan(Integer value) {
            addCriterion("u_fk >", value, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_fk >=", value, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkLessThan(Integer value) {
            addCriterion("u_fk <", value, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkLessThanOrEqualTo(Integer value) {
            addCriterion("u_fk <=", value, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkIn(List<Integer> values) {
            addCriterion("u_fk in", values, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkNotIn(List<Integer> values) {
            addCriterion("u_fk not in", values, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkBetween(Integer value1, Integer value2) {
            addCriterion("u_fk between", value1, value2, "uFk");
            return (Criteria) this;
        }

        public Criteria andUFkNotBetween(Integer value1, Integer value2) {
            addCriterion("u_fk not between", value1, value2, "uFk");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andBcontentIsNull() {
            addCriterion("bcontent is null");
            return (Criteria) this;
        }

        public Criteria andBcontentIsNotNull() {
            addCriterion("bcontent is not null");
            return (Criteria) this;
        }

        public Criteria andBcontentEqualTo(String value) {
            addCriterion("bcontent =", value, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentNotEqualTo(String value) {
            addCriterion("bcontent <>", value, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentGreaterThan(String value) {
            addCriterion("bcontent >", value, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentGreaterThanOrEqualTo(String value) {
            addCriterion("bcontent >=", value, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentLessThan(String value) {
            addCriterion("bcontent <", value, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentLessThanOrEqualTo(String value) {
            addCriterion("bcontent <=", value, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentLike(String value) {
            addCriterion("bcontent like", value, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentNotLike(String value) {
            addCriterion("bcontent not like", value, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentIn(List<String> values) {
            addCriterion("bcontent in", values, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentNotIn(List<String> values) {
            addCriterion("bcontent not in", values, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentBetween(String value1, String value2) {
            addCriterion("bcontent between", value1, value2, "bcontent");
            return (Criteria) this;
        }

        public Criteria andBcontentNotBetween(String value1, String value2) {
            addCriterion("bcontent not between", value1, value2, "bcontent");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}