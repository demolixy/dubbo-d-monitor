/**
 * 
 */
package com.ants.monitor.bean.invoke;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lixiangyang
 *
 */
public class InvokeBean {

    private String interfaceName;
    
    private String pojoClassName;
    
    private List<Map> fieldMap = new ArrayList<Map>();

    /**
     * @return the interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * @param interfaceName the interfaceName to set
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     * @return the pojoClassName
     */
    public String getPojoClassName() {
        return pojoClassName;
    }

    /**
     * @param pojoClassName the pojoClassName to set
     */
    public void setPojoClassName(String pojoClassName) {
        this.pojoClassName = pojoClassName;
    }

    /**
     * @return the fieldMap
     */
    public List<Map> getFieldMap() {
        return fieldMap;
    }

    /**
     * @param fieldMap the fieldMap to set
     */
    public void setFieldMap(List<Map> fieldMap) {
        this.fieldMap = fieldMap;
    }
    
}
