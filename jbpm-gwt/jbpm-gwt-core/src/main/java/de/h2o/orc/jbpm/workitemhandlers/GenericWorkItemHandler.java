package de.h2o.orc.jbpm.workitemhandlers;

import java.util.HashMap;

import org.drools.runtime.process.WorkItem;
import org.drools.runtime.process.WorkItemHandler;
import org.drools.runtime.process.WorkItemManager;

/**
 * FIXME Instead of using this class the already created generic work item handler should be used. (As a Library, not as a class directly inside of this Project!)
 * @author m.mertinat
 * Created on 02.02.2012
 */
public class GenericWorkItemHandler implements WorkItemHandler {
    
    /** The base URL for the REST API Calls */
    private String baseURL;

    /**
     * Constructor
     * @param baseURL The base URL for the REST API Calls.
     */
    public GenericWorkItemHandler(String baseURL){
        if(baseURL==null) throw new NullPointerException("Base URL for REST Cals cannot be null");
        this.baseURL = baseURL;
    }

    /**
     * {@inheritDoc}
     */
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        System.out.println("########## WORKITEM EXECUTED :D ########");
        System.out.println("BASEURL: " + baseURL);
        
        
        manager.completeWorkItem(workItem.getId(), new HashMap<String, Object>());
    }

    /**
     * {@inheritDoc}
     */
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
        System.out.println("######## WORKITEM ABORTED :-/ ############");
        System.out.println("BASEURL: " + baseURL);
    }

}
