
package com.example.ft2.db.generator;


import java.net.URL;

/**
 * 生成 数据库表映射  需修改mybatisGenerator.xml内的 jar路径
 */
public class Main {

    public void run() throws Exception {
        URL urlPath = this.getClass().getClassLoader().getResource("generatorConfig.xml");
        String path = urlPath.toString();
        path = java.net.URLDecoder.decode(path, "UTF-8");
        String filePrefix = "file:";
        path = path.substring(filePrefix.length());
        String[] args = {"-configfile", path, "-overwrite"};
        ShellRunner.main(args);
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

}
