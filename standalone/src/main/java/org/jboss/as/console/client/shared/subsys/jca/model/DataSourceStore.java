/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package org.jboss.as.console.client.shared.subsys.jca.model;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.jboss.as.console.client.domain.model.SimpleCallback;
import org.jboss.as.console.client.shared.model.ResponseWrapper;
import org.jboss.as.console.client.shared.subsys.jca.model.DataSource;

import java.util.List;
import java.util.Map;

/**
 * @author Heiko Braun
 * @date 4/19/11
 */
public interface DataSourceStore {

    void loadDataSources(String profile, AsyncCallback<List<DataSource>> callback);
    void loadXADataSources(String profile, final AsyncCallback<List<XADataSource>> callback);
    void createDataSource(String profile, DataSource datasource, AsyncCallback<ResponseWrapper<Boolean>> callback);
    void deleteDataSource(String profile, DataSource dataSource, AsyncCallback<Boolean> callback);
    void enableDataSource(String profile, DataSource dataSource, boolean doEnable, AsyncCallback<ResponseWrapper<Boolean>> callback);

    void updateDataSource(String profile, String name, Map<String,Object> changedValues, AsyncCallback<ResponseWrapper<Boolean>> callback);

    void createXADataSource(String profile, XADataSource datasource, AsyncCallback<Boolean> callback);

    void enableXADataSource(String name, XADataSource entity, boolean doEnable, AsyncCallback<ResponseWrapper<Boolean>> callback);
    void deleteXADataSource(String name, XADataSource entity, AsyncCallback<Boolean> callback);

    void updateXADataSource(String profile, String name, Map<String, Object> changedValues, AsyncCallback<ResponseWrapper<Boolean>> callback);
}
