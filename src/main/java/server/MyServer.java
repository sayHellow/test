package server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by lanxum on 2015/11/20.
 */
public class MyServer {

    public static void main(String[] args) throws Exception {

        // 服务器的监听端口
        Server server = new Server(8855);

        // 关联一个已经存在的上下文
        WebAppContext context = new WebAppContext();

        // 设置描述符位置
        context.setDescriptor("./webapp/WEB-INF/web.xml");

        // 设置Web内容上下文路径
        context.setResourceBase("./webapp");

        // 设置上下文路径
        context.setContextPath("/mooc");
        context.setParentLoaderPriority(true);

        server.setHandler(context);

        // 启动
        server.start();
        server.join();
    }
}
