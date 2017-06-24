package thriftserver

import (
	"testing"
	"code.aliyun.com/wyunshare/thrift-server/business"
	"code.aliyun.com/wyunshare/thrift-server/processor"
	"code.aliyun.com/wyunshare/thrift-server/gen-go/server"
)
type BusinessServiceImpl struct {}
func (msi *BusinessServiceImpl) Handle(operation string, paramJSON []byte) (r *server.Response, err error) {
	return nil, nil
}

func TestStartServer(t *testing.T) {


	businessServiceMap := &business.BusinessServiceMap{}
	businessServiceMap.RegisterService("businessService", &BusinessServiceImpl{})
	wyunServiceImpl := processor.WyunServiceImpl{
		BusinessServiceMap: businessServiceMap,
	}
	StartServer("localhost", "9092", &wyunServiceImpl)
}