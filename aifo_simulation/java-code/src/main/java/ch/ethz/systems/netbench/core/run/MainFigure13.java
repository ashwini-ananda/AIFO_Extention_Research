package ch.ethz.systems.netbench.core.run;

public class MainFigure13 {
    /*
     * Figure 13: Simulation results of web search workload with fair queueing
     * Result data are stored in java-code/project/aifo/plots/aifo_evaluation/fairness/web_search_workload
     */

    public static void main(String args[]) {


        MainFromProperties.main(new String[]{"C:/Users/14129/College/WAN/AIFO/aifo_simulation/java-code/projects/aifo/runs/aifo_evaluation/fairness/web_search_workload/3600/AIFOWFQ.properties"
                , "second_transport_layer=udp", "window_size=20", "sample_count=1", "output_port_max_size_packets=100", "link_bandwidth_bit_per_ns=1", "k_value=0.1"});




        // MainFromProperties.main(new String[]{"C:/Users/14129/College/WAN/AIFO/aifo_simulation/java-code/projects/aifo/runs/aifo_evaluation/fairness/web_search_workload/3600/TCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        // MainFromProperties.main(new String[]{"C:/Users/14129/College/WAN/AIFO/aifo_simulation/java-code/projects/aifo/runs/aifo_evaluation/fairness/web_search_workload/3600/DCTCP.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"C:/Users/14129/College/WAN/AIFO/aifo_simulation/java-code/projects/aifo/runs/aifo_evaluation/fairness/web_search_workload/3600/AFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        MainFromProperties.main(new String[]{"C:/Users/14129/College/WAN/AIFO/aifo_simulation/java-code/projects/aifo/runs/aifo_evaluation/fairness/web_search_workload/3600/PIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});
        // MainFromProperties.main(new String[]{"C:/Users/14129/College/WAN/AIFO/aifo_simulation/java-code/projects/aifo/runs/aifo_evaluation/fairness/web_search_workload/3600/SPPIFOWFQ_32.properties", "second_transport_layer=udp", "link_bandwidth_bit_per_ns=1"});


        /* Analyze and plot */
        MainFromProperties.runCommand("python projects/aifo/plots/aifo_evaluation/fairness/analyze.py", true);
        //MainFromProperties.runCommand("gnuplot projects/aifo/plots/aifo_evaluation/fairness/plot.gnuplot", true);
    }
}
