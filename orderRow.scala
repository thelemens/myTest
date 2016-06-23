case class orderRow(itemID :String, itemName :String, itemQuantity :Int, porousReq :Boolean, price :Double){



      def printClass: Unit = {

            println(itemID + " " + itemName + " " + itemQuantity + " " + porousReq + " " + price)
      }

    }