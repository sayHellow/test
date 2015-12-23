package server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by lanxum on 2015/11/20.
 */
public class MyServer {

    public static void main(String[] args) throws Exception {

        // �������ļ����˿�
        Server server = new Server(8855);

        // ����һ���Ѿ����ڵ�������
        WebAppContext context = new WebAppContext();

        // ����������λ��
        context.setDescriptor("./webapp/WEB-INF/web.xml");

        // ����Web����������·��
        context.setResourceBase("./webapp");

        // ����������·��
        context.setContextPath("/mooc");
        context.setParentLoaderPriority(true);

        server.setHandler(context);

        // ����
        server.start();
        server.join();
    }
}
