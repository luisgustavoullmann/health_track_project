package br.com.healthtrack.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String url = req.getRequestURI();
		
		/*@param usuario cookie*/
		String usuario = getUsuario(req);
		
		if(session.getAttribute("user") == null 
				&& !url.endsWith("login")
				&& !url.contains("resources")
				&& !url.contains("index")
				&& !url.contains("sobre")
				&& !url.contains("contato")) {
			request.setAttribute("erro", "Entre com o usuário e senha!");
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			chain.doFilter(request, response);
		}
	}

	private String getUsuario(HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		if(cookies == null);
		String usuario = "deslogado";
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("user.login")) {
				usuario = cookie.getValue();
			}
		}
		
		return usuario;
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
