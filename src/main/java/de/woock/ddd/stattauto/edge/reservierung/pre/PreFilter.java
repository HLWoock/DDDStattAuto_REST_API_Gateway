package de.woock.ddd.stattauto.edge.reservierung.pre;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter {

    private static Logger log = Logger.getLogger(PreFilter.class);
    
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
    
        String method = request.getMethod();
		String url = request.getRequestURL().toString();
		log.info(String.format("%s request to %s", method, url));

        return null;
    }
}