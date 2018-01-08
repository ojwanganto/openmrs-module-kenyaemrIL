/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.kenyaemrIL.api.impl;

import org.hibernate.cfg.NotYetImplementedException;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.kenyaemrIL.KenyaEmrInbox;
import org.openmrs.module.kenyaemrIL.il.ILAppointment;
import org.openmrs.module.kenyaemrIL.il.ILPerson;
import org.openmrs.module.kenyaemrIL.api.KenyaEMRILService;
import org.openmrs.module.kenyaemrIL.api.db.KenyaEMRILDAO;
import org.openmrs.module.kenyaemrIL.il.ILTest;
import org.openmrs.module.kenyaemrIL.il.observation.ILObservation;
import org.openmrs.module.kenyaemrIL.il.pharmacy.ILPharmacyDispense;
import org.openmrs.module.kenyaemrIL.il.pharmacy.ILPharmacyOrder;

import java.util.List;

/**
 * It is a default implementation of {@link KenyaEMRILService}.
 */
public class KenyaEMRILServiceImpl extends BaseOpenmrsService implements KenyaEMRILService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private KenyaEMRILDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(KenyaEMRILDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public KenyaEMRILDAO getDao() {
	    return dao;
    }

    @Override
    public List<ILPerson> getPersonList(boolean status) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public List<ILPerson> getAddPersonList(boolean status) {
        throw new NotYetImplementedException("Not Yet Implemented");

    }

    @Override
    public List<ILPerson> getUpdatePersonList(boolean status) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public boolean sendUpdateRequest(ILPerson ilPerson) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public boolean sendAddPersonRequest(ILPerson ilPerson) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public List<ILAppointment> fetchAllAppointments() {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public List<ILAppointment> fetchAppointments(boolean processed) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public boolean deleteAppointment(ILAppointment ilAppointment) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public ILAppointment createAppointment(ILAppointment ilAppointment) {
        throw new NotYetImplementedException("Not Yet Implemented");    }

    @Override
    public ILAppointment updateAppointment(ILAppointment ilAppointment) {
        throw new NotYetImplementedException("Not Yet Implemented");    }

    @Override
    public List<ILPharmacyOrder> fetchAllPharmacyOrders() {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public List<ILPharmacyOrder> fetchPharmacyOrders(boolean processed) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public ILPharmacyOrder createPharmacyOrder(ILPharmacyOrder ilPharmacyOrder) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public ILPharmacyOrder updatePharmacyOrder(ILPharmacyOrder ilPharmacyOrder) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public boolean deletePharmacyOrder(ILPharmacyOrder ilPharmacyOrder) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public List<ILPharmacyDispense> fetchAllPharmacyDispenses() {
        throw new NotYetImplementedException("Not Yet Implemented");   
    }

    @Override
    public List<ILPharmacyDispense> fetchPharmacyDispenses(boolean processed) {
        throw new NotYetImplementedException("Not Yet Implemented");   
    }

    @Override
    public ILPharmacyDispense createPharmacyDispense(ILPharmacyDispense ilPharmacyDispense) {
        throw new NotYetImplementedException("Not Yet Implemented");   
    }

    @Override
    public ILPharmacyDispense updatePharmacyDispense(ILPharmacyDispense ilPharmacyDispense) {
        throw new NotYetImplementedException("Not Yet Implemented");   
    }

    @Override
    public boolean deletePharmacyDispense(ILPharmacyDispense ilPharmacyDispense) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public List<ILObservation> fetchAllObservations() {
        throw new NotYetImplementedException("Not Yet Implemented");   
    }

    @Override
    public List<ILObservation> fetchObservations(boolean processed) {
        throw new NotYetImplementedException("Not Yet Implemented");   
    }

    @Override
    public ILObservation createObservation(ILObservation ilObservation) {
        throw new NotYetImplementedException("Not Yet Implemented");   
    }

    @Override
    public ILObservation updateObservation(ILObservation ilObservation) {
        throw new NotYetImplementedException("Not Yet Implemented");   
    }

    @Override
    public boolean deleteObservation(ILObservation ilObservation) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public KenyaEmrInbox getKenyaEmrInboxByUuid(String uuid) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }


    @Override
    public KenyaEmrInbox saveKenyaEmrInbox(KenyaEmrInbox kenyaEmrInbox) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public void retireKenyaEmrInbox(KenyaEmrInbox kenyaEmrInbox, String s) {

    }

    @Override
    public void purgeKenyaEmrInbox(KenyaEmrInbox kenyaEmrInbox) {

    }

    @Override
    public List<KenyaEmrInbox> getAllKenyaEmrInboxes(boolean b) {
        return null;
    }

    @Override
    public List<KenyaEmrInbox> getKenyaEmrInboxesByType(String type) {
        throw new NotYetImplementedException("Not Yet Implemented");
    }

    @Override
    public ILTest getILTestByUuid(String uniqueId) {
        ILTest ilTest = this.dao.getILTestByUuid(uniqueId);
        System.out.println("What is it htat was returned: "+ilTest);
        return ilTest;
    }

    @Override
    public ILTest saveILTest(ILTest delegate) {
        return this.dao.createILTest(delegate);
    }

    @Override
    public List<ILTest> getAllILTests(Boolean includeAll) {
        return this.dao.getAllILTests(includeAll);
    }

    @Override
    public void deleteILTest(ILTest ilTest) {
        this.dao.deleteILTest(ilTest);
    }

}