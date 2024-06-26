const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootsu39z/",
            name: "springbootsu39z",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootsu39z/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线考试系统"
        } 
    }
}
export default base
