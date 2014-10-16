package com.gfan.report.frame.dao;

import com.gfan.report.frame.module.UiFwFunctionWidget;
import com.gfan.report.frame.module.UiFwFunctionWidgetExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class UiFwFunctionWidgetDAOImpl extends SqlMapClientDaoSupport implements UiFwFunctionWidgetDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public UiFwFunctionWidgetDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public int countByExample(UiFwFunctionWidgetExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("UI_FW_FUNCTION_WIDGET.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public int deleteByExample(UiFwFunctionWidgetExample example) {
        int rows = getSqlMapClientTemplate().delete("UI_FW_FUNCTION_WIDGET.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public int deleteByPrimaryKey(Integer id) {
        UiFwFunctionWidget key = new UiFwFunctionWidget();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("UI_FW_FUNCTION_WIDGET.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public void insert(UiFwFunctionWidget record) {
        getSqlMapClientTemplate().insert("UI_FW_FUNCTION_WIDGET.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public void insertSelective(UiFwFunctionWidget record) {
        getSqlMapClientTemplate().insert("UI_FW_FUNCTION_WIDGET.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public List selectByExample(UiFwFunctionWidgetExample example) {
        List list = getSqlMapClientTemplate().queryForList("UI_FW_FUNCTION_WIDGET.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public UiFwFunctionWidget selectByPrimaryKey(Integer id) {
        UiFwFunctionWidget key = new UiFwFunctionWidget();
        key.setId(id);
        UiFwFunctionWidget record = (UiFwFunctionWidget) getSqlMapClientTemplate().queryForObject("UI_FW_FUNCTION_WIDGET.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public int updateByExampleSelective(UiFwFunctionWidget record, UiFwFunctionWidgetExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("UI_FW_FUNCTION_WIDGET.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public int updateByExample(UiFwFunctionWidget record, UiFwFunctionWidgetExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("UI_FW_FUNCTION_WIDGET.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public int updateByPrimaryKeySelective(UiFwFunctionWidget record) {
        int rows = getSqlMapClientTemplate().update("UI_FW_FUNCTION_WIDGET.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    public int updateByPrimaryKey(UiFwFunctionWidget record) {
        int rows = getSqlMapClientTemplate().update("UI_FW_FUNCTION_WIDGET.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table UI_FW_FUNCTION_WIDGET
     *
     * @ibatorgenerated Thu Sep 25 18:12:08 CST 2014
     */
    private static class UpdateByExampleParms extends UiFwFunctionWidgetExample {
        private Object record;

        public UpdateByExampleParms(Object record, UiFwFunctionWidgetExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}