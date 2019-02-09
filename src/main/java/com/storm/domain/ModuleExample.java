package com.storm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModuleExample() {
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

        public Criteria andModuleIdIsNull() {
            addCriterion("MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("MODULE_ID =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("MODULE_ID <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("MODULE_ID >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ID >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("MODULE_ID <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ID <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("MODULE_ID like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("MODULE_ID not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("MODULE_ID in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("MODULE_ID not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("MODULE_ID between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("MODULE_ID not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("CTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("CTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(Integer value) {
            addCriterion("CTYPE =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(Integer value) {
            addCriterion("CTYPE <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(Integer value) {
            addCriterion("CTYPE >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CTYPE >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(Integer value) {
            addCriterion("CTYPE <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(Integer value) {
            addCriterion("CTYPE <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<Integer> values) {
            addCriterion("CTYPE in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<Integer> values) {
            addCriterion("CTYPE not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(Integer value1, Integer value2) {
            addCriterion("CTYPE between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CTYPE not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIsNull() {
            addCriterion("CREATE_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIsNotNull() {
            addCriterion("CREATE_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDeptEqualTo(String value) {
            addCriterion("CREATE_DEPT =", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotEqualTo(String value) {
            addCriterion("CREATE_DEPT <>", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptGreaterThan(String value) {
            addCriterion("CREATE_DEPT >", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DEPT >=", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLessThan(String value) {
            addCriterion("CREATE_DEPT <", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DEPT <=", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLike(String value) {
            addCriterion("CREATE_DEPT like", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotLike(String value) {
            addCriterion("CREATE_DEPT not like", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIn(List<String> values) {
            addCriterion("CREATE_DEPT in", values, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotIn(List<String> values) {
            addCriterion("CREATE_DEPT not in", values, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptBetween(String value1, String value2) {
            addCriterion("CREATE_DEPT between", value1, value2, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotBetween(String value1, String value2) {
            addCriterion("CREATE_DEPT not between", value1, value2, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNull() {
            addCriterion("pcode is null");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNotNull() {
            addCriterion("pcode is not null");
            return (Criteria) this;
        }

        public Criteria andPcodeEqualTo(String value) {
            addCriterion("pcode =", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotEqualTo(String value) {
            addCriterion("pcode <>", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThan(String value) {
            addCriterion("pcode >", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThanOrEqualTo(String value) {
            addCriterion("pcode >=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThan(String value) {
            addCriterion("pcode <", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThanOrEqualTo(String value) {
            addCriterion("pcode <=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLike(String value) {
            addCriterion("pcode like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotLike(String value) {
            addCriterion("pcode not like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeIn(List<String> values) {
            addCriterion("pcode in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotIn(List<String> values) {
            addCriterion("pcode not in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeBetween(String value1, String value2) {
            addCriterion("pcode between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotBetween(String value1, String value2) {
            addCriterion("pcode not between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andComponentIsNull() {
            addCriterion("component is null");
            return (Criteria) this;
        }

        public Criteria andComponentIsNotNull() {
            addCriterion("component is not null");
            return (Criteria) this;
        }

        public Criteria andComponentEqualTo(String value) {
            addCriterion("component =", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotEqualTo(String value) {
            addCriterion("component <>", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThan(String value) {
            addCriterion("component >", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanOrEqualTo(String value) {
            addCriterion("component >=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThan(String value) {
            addCriterion("component <", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThanOrEqualTo(String value) {
            addCriterion("component <=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLike(String value) {
            addCriterion("component like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotLike(String value) {
            addCriterion("component not like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentIn(List<String> values) {
            addCriterion("component in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotIn(List<String> values) {
            addCriterion("component not in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentBetween(String value1, String value2) {
            addCriterion("component between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotBetween(String value1, String value2) {
            addCriterion("component not between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andRedirectIsNull() {
            addCriterion("redirect is null");
            return (Criteria) this;
        }

        public Criteria andRedirectIsNotNull() {
            addCriterion("redirect is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectEqualTo(String value) {
            addCriterion("redirect =", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotEqualTo(String value) {
            addCriterion("redirect <>", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectGreaterThan(String value) {
            addCriterion("redirect >", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectGreaterThanOrEqualTo(String value) {
            addCriterion("redirect >=", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLessThan(String value) {
            addCriterion("redirect <", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLessThanOrEqualTo(String value) {
            addCriterion("redirect <=", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLike(String value) {
            addCriterion("redirect like", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotLike(String value) {
            addCriterion("redirect not like", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectIn(List<String> values) {
            addCriterion("redirect in", values, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotIn(List<String> values) {
            addCriterion("redirect not in", values, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectBetween(String value1, String value2) {
            addCriterion("redirect between", value1, value2, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotBetween(String value1, String value2) {
            addCriterion("redirect not between", value1, value2, "redirect");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNull() {
            addCriterion("hidden is null");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNotNull() {
            addCriterion("hidden is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenEqualTo(Boolean value) {
            addCriterion("hidden =", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotEqualTo(Boolean value) {
            addCriterion("hidden <>", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThan(Boolean value) {
            addCriterion("hidden >", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hidden >=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThan(Boolean value) {
            addCriterion("hidden <", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThanOrEqualTo(Boolean value) {
            addCriterion("hidden <=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenIn(List<Boolean> values) {
            addCriterion("hidden in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotIn(List<Boolean> values) {
            addCriterion("hidden not in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenBetween(Boolean value1, Boolean value2) {
            addCriterion("hidden between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hidden not between", value1, value2, "hidden");
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