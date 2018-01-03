package units;

public interface Encryption {
    /**
     * 加密密码
     * @param rawPassword 原始密码
     * @return 加密后的密码
     */
    public String encrypt(String rawPassword);

    /**
     * 密码匹配
     * @param rawPassword 原始密码
     * @param password 摘要
     * @return  是否匹配
     */
    public boolean match(String rawPassword, String password);
}
