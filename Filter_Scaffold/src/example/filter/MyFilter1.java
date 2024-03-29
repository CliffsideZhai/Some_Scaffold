package example.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author cliffside
 * @date 2021-04-29 9:33
 */
public class MyFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String name = filterConfig.getInitParameter("name");
        System.out.println(name.toString());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter doFilter 对请求作出过滤");
        // 通过一行代码 放行请求
        // 放行请求,交给过滤器链继续进行过滤 最后到达资源
        System.out.println("MyFilter1   在过滤请求 ");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("MyFilter1   在过滤响应");
    }

    @Override
    public void destroy() {

    }
}
