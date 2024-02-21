var hm = require("http");
var fs = require('fs');
hm.createServer(function(req, resp){
    fs.readFile("/home/student/Documents/node-v20.9.0-linux-x64/bin/hello.txt",function(err, data){
        resp.writeHead(200, {"Content-type":"text/plain"});
        resp.write(data);
        return resp.end();
    });
}).listen(8082);
