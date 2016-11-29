package org.cloudsimplus.listeners;

import org.cloudbus.cloudsim.cloudlets.Cloudlet;

/**
 * An {@link EventInfo} interface that stores data to be passed
 * to {@link EventListener} objects that are registered to be notified
 * about events happened for a given {@link Cloudlet}.
 *
 * @author Manoel Campos da Silva Filho
 */
public interface CloudletEventInfo {

    /**
     *
     * @return the cloudlet that has finished
     */
    Cloudlet getCloudlet();

    /**
     * Sets the cloudlet that has finished
     * @param cloudlet
     */
    void setCloudlet(Cloudlet cloudlet);

}
