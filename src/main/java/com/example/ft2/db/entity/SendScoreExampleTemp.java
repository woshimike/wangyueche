package com.example.ft2.db.entity;

import java.util.ArrayList;
import java.util.List;

public class SendScoreExampleTemp {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendScoreExampleTemp() {
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

        public Criteria andSendUserIdIsNull() {
            addCriterion("send_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSendUserIdIsNotNull() {
            addCriterion("send_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendUserIdEqualTo(Long value) {
            addCriterion("send_user_id =", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotEqualTo(Long value) {
            addCriterion("send_user_id <>", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdGreaterThan(Long value) {
            addCriterion("send_user_id >", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("send_user_id >=", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdLessThan(Long value) {
            addCriterion("send_user_id <", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdLessThanOrEqualTo(Long value) {
            addCriterion("send_user_id <=", value, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdIn(List<Long> values) {
            addCriterion("send_user_id in", values, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotIn(List<Long> values) {
            addCriterion("send_user_id not in", values, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdBetween(Long value1, Long value2) {
            addCriterion("send_user_id between", value1, value2, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andSendUserIdNotBetween(Long value1, Long value2) {
            addCriterion("send_user_id not between", value1, value2, "sendUserId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIsNull() {
            addCriterion("send_date_time is null");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIsNotNull() {
            addCriterion("send_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeEqualTo(Long value) {
            addCriterion("send_date_time =", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotEqualTo(Long value) {
            addCriterion("send_date_time <>", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeGreaterThan(Long value) {
            addCriterion("send_date_time >", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("send_date_time >=", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeLessThan(Long value) {
            addCriterion("send_date_time <", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeLessThanOrEqualTo(Long value) {
            addCriterion("send_date_time <=", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIn(List<Long> values) {
            addCriterion("send_date_time in", values, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotIn(List<Long> values) {
            addCriterion("send_date_time not in", values, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeBetween(Long value1, Long value2) {
            addCriterion("send_date_time between", value1, value2, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotBetween(Long value1, Long value2) {
            addCriterion("send_date_time not between", value1, value2, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSocreKeyIsNull() {
            addCriterion("socre_key is null");
            return (Criteria) this;
        }

        public Criteria andSocreKeyIsNotNull() {
            addCriterion("socre_key is not null");
            return (Criteria) this;
        }

        public Criteria andSocreKeyEqualTo(String value) {
            addCriterion("socre_key =", value, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyNotEqualTo(String value) {
            addCriterion("socre_key <>", value, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyGreaterThan(String value) {
            addCriterion("socre_key >", value, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyGreaterThanOrEqualTo(String value) {
            addCriterion("socre_key >=", value, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyLessThan(String value) {
            addCriterion("socre_key <", value, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyLessThanOrEqualTo(String value) {
            addCriterion("socre_key <=", value, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyLike(String value) {
            addCriterion("socre_key like", value, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyNotLike(String value) {
            addCriterion("socre_key not like", value, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyIn(List<String> values) {
            addCriterion("socre_key in", values, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyNotIn(List<String> values) {
            addCriterion("socre_key not in", values, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyBetween(String value1, String value2) {
            addCriterion("socre_key between", value1, value2, "socreKey");
            return (Criteria) this;
        }

        public Criteria andSocreKeyNotBetween(String value1, String value2) {
            addCriterion("socre_key not between", value1, value2, "socreKey");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIsNull() {
            addCriterion("receive_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIsNotNull() {
            addCriterion("receive_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdEqualTo(Long value) {
            addCriterion("receive_user_id =", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotEqualTo(Long value) {
            addCriterion("receive_user_id <>", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdGreaterThan(Long value) {
            addCriterion("receive_user_id >", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_user_id >=", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdLessThan(Long value) {
            addCriterion("receive_user_id <", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdLessThanOrEqualTo(Long value) {
            addCriterion("receive_user_id <=", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIn(List<Long> values) {
            addCriterion("receive_user_id in", values, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotIn(List<Long> values) {
            addCriterion("receive_user_id not in", values, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdBetween(Long value1, Long value2) {
            addCriterion("receive_user_id between", value1, value2, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotBetween(Long value1, Long value2) {
            addCriterion("receive_user_id not between", value1, value2, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIsNull() {
            addCriterion("receive_date_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIsNotNull() {
            addCriterion("receive_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeEqualTo(Long value) {
            addCriterion("receive_date_time =", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotEqualTo(Long value) {
            addCriterion("receive_date_time <>", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeGreaterThan(Long value) {
            addCriterion("receive_date_time >", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_date_time >=", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeLessThan(Long value) {
            addCriterion("receive_date_time <", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeLessThanOrEqualTo(Long value) {
            addCriterion("receive_date_time <=", value, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeIn(List<Long> values) {
            addCriterion("receive_date_time in", values, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotIn(List<Long> values) {
            addCriterion("receive_date_time not in", values, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeBetween(Long value1, Long value2) {
            addCriterion("receive_date_time between", value1, value2, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTimeNotBetween(Long value1, Long value2) {
            addCriterion("receive_date_time not between", value1, value2, "receiveDateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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