package com.pocs.ananta.spring.cloud.springcloudzuulgatewayservice;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AddRequestHeaderFilter extends ZuulFilter{

	@Override
	public Object run() {

		RequestContext requestContext = RequestContext.getCurrentContext();
		requestContext.addZuulRequestHeader("x-location", "India");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
