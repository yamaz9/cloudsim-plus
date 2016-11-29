/*
 * Title:        CloudSim Toolkit
 * Description:  CloudSim (Cloud Simulation) Toolkit for Modeling and Simulation of Clouds
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2009-2012, The University of Melbourne, Australia
 */
package org.cloudbus.cloudsim.lists;

import java.util.List;

import org.cloudbus.cloudsim.vms.Vm;

/**
 * PowerVmList is a collection of operations on lists of power-enabled VMs.
 *
 * <br/>If you are using any algorithms, policies or workload included in the
 * power package please cite the following paper:<br/>
 *
 * <ul>
 * <li><a href="http://dx.doi.org/10.1002/cpe.1867">Anton Beloglazov, and
 * Rajkumar Buyya, "Optimal Online Deterministic Algorithms and Adaptive
 * Heuristics for Energy and Performance Efficient Dynamic Consolidation of
 * Virtual Machines in Cloud Data Centers", Concurrency and Computation:
 * Practice and Experience (CCPE), Volume 24, Issue 13, Pages: 1397-1420, John
 * Wiley & Sons, Ltd, New York, USA, 2012</a>
 * </ul>
 *
 * @author Anton Beloglazov
 *
 * @author Anton Beloglazov
 * @since CloudSim Toolkit 2.0
 * @todo This class in fact doesn't use a list or PowerVm, but a list of Vm. The
 * used methods are just of the Vm class, thus doesn't have a reason to create
 * another class. This classes don't either stores lists of VM, they only
 * perform operations on lists given by parameter. So, the method of this class
 * would be moved to the VmList class and the class erased.
 */
public class PowerVmList extends VmList {

    /**
     * Sort a given list of VMs by descending order of CPU utilization.
     *
     * @param <T> The generic type
     * @param vmList the vm list to be sorted
     * @param currentSimulationTime the current simulation time to get the current CPU utilization for each Vm
     */
    public static <T extends Vm> void sortByCpuUtilization(List<T> vmList, double currentSimulationTime) {
        vmList.sort((vm1, vm2) -> {
            Double vm1Utilization = vm1.getTotalUtilizationOfCpuMips(currentSimulationTime);
            Double vm2Utilization = vm2.getTotalUtilizationOfCpuMips(currentSimulationTime);
            return vm2Utilization.compareTo(vm1Utilization);
        });
    }

}
