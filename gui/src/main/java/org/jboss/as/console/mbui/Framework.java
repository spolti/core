package org.jboss.as.console.mbui;

import org.jboss.dmr.client.dispatch.DispatchAsync;

/**
 * @author Heiko Braun
 * @date 3/22/13
 */
public interface Framework {

    DispatchAsync getDispatcher();
}
