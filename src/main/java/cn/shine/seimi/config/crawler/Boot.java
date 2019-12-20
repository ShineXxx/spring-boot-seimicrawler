package cn.shine.seimi.config.crawler;

import cn.wanghaomiao.seimi.config.SeimiConfig;
import cn.wanghaomiao.seimi.core.Seimi;

public class Boot {
    public static void main(String[] args){
        SeimiConfig config = new SeimiConfig();
        config.setSeimiAgentHost("127.0.0.1");
        Seimi s = new Seimi(config);
        s.goRun("basic_a");
    }
}