import scala.collection.mutable.ArrayBuffer

class orderForms (orderID_ :String, customerName_ :String, customerAddress_ :String,
                  orderStatus_ :String, available_ :Boolean, orderItems_ :ArrayBuffer[orderRow], orderLocation_ :String){

      var orderID = orderID_
      var customerName = customerName_
      var customerAddress = customerAddress_
      var orderStatus = orderStatus_
      var available = available_
      var orderItems = orderItems_
      var orderLocation = orderLocation_


    }