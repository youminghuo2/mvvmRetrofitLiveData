package com.example.mvvmgithub.model;

import java.util.List;

public class GetJoke {

    /**
     * code : 200
     * message : 成功!
     * result : [{"sid":"31568775","text":"追银行小姐姐全过程，看人家是怎么追女孩的。","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0903/84bbafce-ed8f-11ea-8969-1866daeb0df0_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0903/84bbafce-ed8f-11ea-8969-1866daeb0df0_wpd.mp4","images":null,"up":"396","down":"12","forward":"18","comment":"27","uid":"22904192","name":"百思爆笑","header":"http://wimg.spriteapp.cn/profile/20180809175405412650.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2020-09-17 21:10:05"},{"sid":"31568566","text":"兄弟们，怎么把我的职业说得高端一些？","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0902/d39a6c04-ecc5-11ea-ac6c-1866daeb0df0_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0902/d39a6c04-ecc5-11ea-ac6c-1866daeb0df0_wpd.mp4","images":null,"up":"277","down":"3","forward":"10","comment":"27","uid":"20620899","name":"遇一狗白首","header":"http://wimg.spriteapp.cn/profile/20190318103732351696.jpeg","top_comments_content":"神农","top_comments_voiceuri":"","top_comments_uid":"22956417","top_comments_name":"周正洋","top_comments_header":"http://wimg.spriteapp.cn/profile","passtime":"2020-09-17 21:00:05"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * sid : 31568775
         * text : 追银行小姐姐全过程，看人家是怎么追女孩的。
         * type : video
         * thumbnail : http://wimg.spriteapp.cn/picture/2020/0903/84bbafce-ed8f-11ea-8969-1866daeb0df0_wpd.jpg
         * video : http://uvideo.spriteapp.cn/video/2020/0903/84bbafce-ed8f-11ea-8969-1866daeb0df0_wpd.mp4
         * images : null
         * up : 396
         * down : 12
         * forward : 18
         * comment : 27
         * uid : 22904192
         * name : 百思爆笑
         * header : http://wimg.spriteapp.cn/profile/20180809175405412650.jpg
         * top_comments_content : null
         * top_comments_voiceuri : null
         * top_comments_uid : null
         * top_comments_name : null
         * top_comments_header : null
         * passtime : 2020-09-17 21:10:05
         */

        private String sid;
        private String text;
        private String type;
        private String thumbnail;
        private String video;
        private Object images;
        private String up;
        private String down;
        private String forward;
        private String comment;
        private String uid;
        private String name;
        private String header;
        private Object top_comments_content;
        private Object top_comments_voiceuri;
        private Object top_comments_uid;
        private Object top_comments_name;
        private Object top_comments_header;
        private String passtime;

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public Object getImages() {
            return images;
        }

        public void setImages(Object images) {
            this.images = images;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getDown() {
            return down;
        }

        public void setDown(String down) {
            this.down = down;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public Object getTop_comments_content() {
            return top_comments_content;
        }

        public void setTop_comments_content(Object top_comments_content) {
            this.top_comments_content = top_comments_content;
        }

        public Object getTop_comments_voiceuri() {
            return top_comments_voiceuri;
        }

        public void setTop_comments_voiceuri(Object top_comments_voiceuri) {
            this.top_comments_voiceuri = top_comments_voiceuri;
        }

        public Object getTop_comments_uid() {
            return top_comments_uid;
        }

        public void setTop_comments_uid(Object top_comments_uid) {
            this.top_comments_uid = top_comments_uid;
        }

        public Object getTop_comments_name() {
            return top_comments_name;
        }

        public void setTop_comments_name(Object top_comments_name) {
            this.top_comments_name = top_comments_name;
        }

        public Object getTop_comments_header() {
            return top_comments_header;
        }

        public void setTop_comments_header(Object top_comments_header) {
            this.top_comments_header = top_comments_header;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }
    }
}
