package units;

import javax.servlet.http.HttpServletRequest;

public interface Ip {
    public String getIpAddr(HttpServletRequest request);
}
