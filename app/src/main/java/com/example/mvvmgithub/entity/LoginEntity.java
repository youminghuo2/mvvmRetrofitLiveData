package com.example.mvvmgithub.entity;

import java.util.List;

/**
 * @Author zcy
 * @CreateDate: 2020/10/22
 */
public class LoginEntity {
    /**
     * code : SUCCESS
     * msg : 成功
     * data : {"sessionId":"32503663-aa56-457a-80bb-397c313e703b","createDtMs":1603261425675,"principal":{"id":82,"username":"123123123","name":"","mobile":"13151942718"},"authorities":[{"authority":"USER"},{"authority":"USER:ADMIN"},{"authority":"USER:ADMIN:ADD"},{"authority":"USER:TEACHER"}]}
     * success : true
     */

    private String code;
    private String msg;
    private DataBean data;
    private boolean success;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataBean {
        /**
         * sessionId : 32503663-aa56-457a-80bb-397c313e703b
         * createDtMs : 1603261425675
         * principal : {"id":82,"username":"123123123","name":"","mobile":"13151942718"}
         * authorities : [{"authority":"USER"},{"authority":"USER:ADMIN"},{"authority":"USER:ADMIN:ADD"},{"authority":"USER:TEACHER"}]
         */

        private String sessionId;
        private long createDtMs;
        private PrincipalBean principal;
        private List<AuthoritiesBean> authorities;

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public long getCreateDtMs() {
            return createDtMs;
        }

        public void setCreateDtMs(long createDtMs) {
            this.createDtMs = createDtMs;
        }

        public PrincipalBean getPrincipal() {
            return principal;
        }

        public void setPrincipal(PrincipalBean principal) {
            this.principal = principal;
        }

        public List<AuthoritiesBean> getAuthorities() {
            return authorities;
        }

        public void setAuthorities(List<AuthoritiesBean> authorities) {
            this.authorities = authorities;
        }

        public static class PrincipalBean {
            /**
             * id : 82
             * username : 123123123
             * name :
             * mobile : 13151942718
             */

            private int id;
            private String username;
            private String name;
            private String mobile;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }
        }

        public static class AuthoritiesBean {
            /**
             * authority : USER
             */

            private String authority;

            public String getAuthority() {
                return authority;
            }

            public void setAuthority(String authority) {
                this.authority = authority;
            }
        }
    }
}
