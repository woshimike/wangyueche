package com.example.ft2.db.entity;

import java.util.ArrayList;
import java.util.List;

public class DailyDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailyDataExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNumIsNull() {
            addCriterion("user_num is null");
            return (Criteria) this;
        }

        public Criteria andUserNumIsNotNull() {
            addCriterion("user_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumEqualTo(Long value) {
            addCriterion("user_num =", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotEqualTo(Long value) {
            addCriterion("user_num <>", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumGreaterThan(Long value) {
            addCriterion("user_num >", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumGreaterThanOrEqualTo(Long value) {
            addCriterion("user_num >=", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLessThan(Long value) {
            addCriterion("user_num <", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLessThanOrEqualTo(Long value) {
            addCriterion("user_num <=", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumIn(List<Long> values) {
            addCriterion("user_num in", values, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotIn(List<Long> values) {
            addCriterion("user_num not in", values, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumBetween(Long value1, Long value2) {
            addCriterion("user_num between", value1, value2, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotBetween(Long value1, Long value2) {
            addCriterion("user_num not between", value1, value2, "userNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumIsNull() {
            addCriterion("incr_user_num is null");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumIsNotNull() {
            addCriterion("incr_user_num is not null");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumEqualTo(Long value) {
            addCriterion("incr_user_num =", value, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumNotEqualTo(Long value) {
            addCriterion("incr_user_num <>", value, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumGreaterThan(Long value) {
            addCriterion("incr_user_num >", value, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumGreaterThanOrEqualTo(Long value) {
            addCriterion("incr_user_num >=", value, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumLessThan(Long value) {
            addCriterion("incr_user_num <", value, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumLessThanOrEqualTo(Long value) {
            addCriterion("incr_user_num <=", value, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumIn(List<Long> values) {
            addCriterion("incr_user_num in", values, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumNotIn(List<Long> values) {
            addCriterion("incr_user_num not in", values, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumBetween(Long value1, Long value2) {
            addCriterion("incr_user_num between", value1, value2, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andIncrUserNumNotBetween(Long value1, Long value2) {
            addCriterion("incr_user_num not between", value1, value2, "incrUserNum");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNull() {
            addCriterion("total_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNotNull() {
            addCriterion("total_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeEqualTo(Long value) {
            addCriterion("total_time =", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotEqualTo(Long value) {
            addCriterion("total_time <>", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThan(Long value) {
            addCriterion("total_time >", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_time >=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThan(Long value) {
            addCriterion("total_time <", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThanOrEqualTo(Long value) {
            addCriterion("total_time <=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIn(List<Long> values) {
            addCriterion("total_time in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotIn(List<Long> values) {
            addCriterion("total_time not in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeBetween(Long value1, Long value2) {
            addCriterion("total_time between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotBetween(Long value1, Long value2) {
            addCriterion("total_time not between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andUsedNumIsNull() {
            addCriterion("used_num is null");
            return (Criteria) this;
        }

        public Criteria andUsedNumIsNotNull() {
            addCriterion("used_num is not null");
            return (Criteria) this;
        }

        public Criteria andUsedNumEqualTo(Long value) {
            addCriterion("used_num =", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotEqualTo(Long value) {
            addCriterion("used_num <>", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumGreaterThan(Long value) {
            addCriterion("used_num >", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumGreaterThanOrEqualTo(Long value) {
            addCriterion("used_num >=", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumLessThan(Long value) {
            addCriterion("used_num <", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumLessThanOrEqualTo(Long value) {
            addCriterion("used_num <=", value, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumIn(List<Long> values) {
            addCriterion("used_num in", values, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotIn(List<Long> values) {
            addCriterion("used_num not in", values, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumBetween(Long value1, Long value2) {
            addCriterion("used_num between", value1, value2, "usedNum");
            return (Criteria) this;
        }

        public Criteria andUsedNumNotBetween(Long value1, Long value2) {
            addCriterion("used_num not between", value1, value2, "usedNum");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNull() {
            addCriterion("recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNotNull() {
            addCriterion("recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountEqualTo(Long value) {
            addCriterion("recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(Long value) {
            addCriterion("recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(Long value) {
            addCriterion("recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(Long value) {
            addCriterion("recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<Long> values) {
            addCriterion("recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<Long> values) {
            addCriterion("recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(Long value1, Long value2) {
            addCriterion("recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("recharge_amount not between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNull() {
            addCriterion("login_num is null");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNotNull() {
            addCriterion("login_num is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNumEqualTo(Long value) {
            addCriterion("login_num =", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotEqualTo(Long value) {
            addCriterion("login_num <>", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThan(Long value) {
            addCriterion("login_num >", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThanOrEqualTo(Long value) {
            addCriterion("login_num >=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThan(Long value) {
            addCriterion("login_num <", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThanOrEqualTo(Long value) {
            addCriterion("login_num <=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumIn(List<Long> values) {
            addCriterion("login_num in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotIn(List<Long> values) {
            addCriterion("login_num not in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumBetween(Long value1, Long value2) {
            addCriterion("login_num between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotBetween(Long value1, Long value2) {
            addCriterion("login_num not between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumIsNull() {
            addCriterion("rihuo_num is null");
            return (Criteria) this;
        }

        public Criteria andRihuoNumIsNotNull() {
            addCriterion("rihuo_num is not null");
            return (Criteria) this;
        }

        public Criteria andRihuoNumEqualTo(Long value) {
            addCriterion("rihuo_num =", value, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumNotEqualTo(Long value) {
            addCriterion("rihuo_num <>", value, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumGreaterThan(Long value) {
            addCriterion("rihuo_num >", value, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumGreaterThanOrEqualTo(Long value) {
            addCriterion("rihuo_num >=", value, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumLessThan(Long value) {
            addCriterion("rihuo_num <", value, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumLessThanOrEqualTo(Long value) {
            addCriterion("rihuo_num <=", value, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumIn(List<Long> values) {
            addCriterion("rihuo_num in", values, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumNotIn(List<Long> values) {
            addCriterion("rihuo_num not in", values, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumBetween(Long value1, Long value2) {
            addCriterion("rihuo_num between", value1, value2, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andRihuoNumNotBetween(Long value1, Long value2) {
            addCriterion("rihuo_num not between", value1, value2, "rihuoNum");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeIsNull() {
            addCriterion("system_total_time is null");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeIsNotNull() {
            addCriterion("system_total_time is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeEqualTo(Long value) {
            addCriterion("system_total_time =", value, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeNotEqualTo(Long value) {
            addCriterion("system_total_time <>", value, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeGreaterThan(Long value) {
            addCriterion("system_total_time >", value, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("system_total_time >=", value, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeLessThan(Long value) {
            addCriterion("system_total_time <", value, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeLessThanOrEqualTo(Long value) {
            addCriterion("system_total_time <=", value, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeIn(List<Long> values) {
            addCriterion("system_total_time in", values, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeNotIn(List<Long> values) {
            addCriterion("system_total_time not in", values, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeBetween(Long value1, Long value2) {
            addCriterion("system_total_time between", value1, value2, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andSystemTotalTimeNotBetween(Long value1, Long value2) {
            addCriterion("system_total_time not between", value1, value2, "systemTotalTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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