import scala.collection.mutable.ArrayBuffer

/**
  * Created by Administrator on 15/06/2016.
  */


object orderList {


  //order 1 rows
  var order1Row1 = new orderRow("01212", "gnome", 4, false, 20.0)
  var order1Row2 = new orderRow("01213", "shovel", 1, false, 10.0)

  //order 2 rows
  var order2Row1 = new orderRow("01212", "gnome", 5, true, 80.0)

  //order 3 rows
  var order3Row1 = new orderRow("01212", "gnome", 2, true, 80.0)
  var order3Row2 = new orderRow("01213", "shovel", 4, false, 60.0)
  var order3Row3 = new orderRow("01214", "rake", 1, false, 10.0)
  var order3Row4 = new orderRow("01215", "potato", 4, false, 2.0)

  //order 4 rows
  var order4Row1 = new orderRow("01212", "gnome", 2, true, 80.0)
  var order4Row2 = new orderRow("01213", "shovel", 4, true, 60.0)
  var order4Row3 = new orderRow("01214", "rake", 1, false, 10.0)
  var order4Row4 = new orderRow("01215", "potato", 4, false, 2.0)
  var order4Row5 = new orderRow("01216", "poo", 400, false, 400.0)
  var order4Row6 = new orderRow("01212", "gnome", 10, false, 80.0)

  //order 5 rows
  var order5Row1 = new orderRow("01212", "gnome", 20, true, 80.0)
  var order5Row2 = new orderRow("01213", "shovel", 40, true, 60.0)
  var order5Row3 = new orderRow("01214", "rake", 5, false, 10.0)
  var order5Row4 = new orderRow("01215", "potato", 42, false, 2.0)
  var order5Row5 = new orderRow("01216", "poo", 30, false, 400.0)
  var order5Row6 = new orderRow("01212", "gnome", 50, false, 80.0)
  var order5Row7 = new orderRow("01213", "shovel", 50, false, 80.0)

  //order 6 rows
  var order6Row1 = new orderRow("01212", "gnome", 5, true, 80.0)

  //order 7 rows
  var order7Row1 = new orderRow("01212", "gnome", 600, false, 800.0)

  //order 8 rows
  var order8Row1 = new orderRow("01212", "gnome", 5, false, 80.0)

  //order 9 rows
  var order9Row1 = new orderRow("01212", "gnome", 50, false, 160.0)


  //order 1 array of order rows
  var order1 = ArrayBuffer(order1Row1, order1Row2)
  //order 2 array of order rows
  var order2 = ArrayBuffer(order2Row1)
  //order 3 array of order rows
  var order3 = ArrayBuffer(order3Row1, order3Row2, order3Row3)
  //order 3 array of order rows
  var order4 = ArrayBuffer(order4Row1, order4Row2, order4Row3, order4Row4, order4Row5, order4Row6)
  //order 3 array of order rows
  var order5 = ArrayBuffer(order5Row1, order5Row2, order5Row3, order5Row4, order5Row5, order5Row6, order5Row7)
  //order 3 array of order rows
  var order6 = ArrayBuffer(order6Row1)
  //order 3 array of order rows
  var order7 = ArrayBuffer(order7Row1)
  //order 3 array of order rows
  var order8 = ArrayBuffer(order8Row1)
  //order 3 array of order rows
  var order9 = ArrayBuffer(order9Row1)


  var orderForm1 = new orderForms("90909", "Yang Wong", "11 road", "not yet processed", true, order1, "na")
  var orderForm2 = new orderForms("90910", "Shrek Onion", "12 road", "not yet processed", true, order2, "na")
  var orderForm3 = new orderForms("90911", "John Cena", "14 road", "processed", false, order3, "na")

  var orderForm4 = new orderForms("90912", "Angry Bird", "15 road", "not yet processed", true, order4, "na")
  var orderForm5 = new orderForms("90913", "Harry Potter", "16 road", "processing", false, order5, "na")
  var orderForm6 = new orderForms("90914", "Luke Skywalker", "17 road", "processed", false, order6, "na")

  var orderForm7 = new orderForms("90915", "Gimli Gloin", "18 road", "not yet processed", true, order7, "na")
  var orderForm8 = new orderForms("90916", "Peter Parker", "19 road", "processed", false, order8, "na")
  var orderForm9 = new orderForms("90917", "Ronald McDonald", "20 road", "processed", false, order9, "na")


  var stock1Row1 = new stockRow("01212", "gnome", 5000, "sector1", true)
  var stock1Row2 = new stockRow("01212", "gnome", 2000, "sector1", false)
  var stock1Row3 = new stockRow("01212", "gnome", 2000, "sector2", true)

  var stock2Row1 = new stockRow("01213", "shovel", 10000, "sector3", false)
  var stock2Row2 = new stockRow("01213", "shovel", 7000, "sector3", true)

  var stock3Row1 = new stockRow("01214", "rake", 2000, "sector2", false)
  var stock3Row2 = new stockRow("01214", "rake", 6000, "sector3", false)

  var stock4Row1 = new stockRow("01215", "potato", 7000, "sector3", false)
  var stock4Row2 = new stockRow("01215", "potato", 2000, "sector2", false)

  var stock5Row1 = new stockRow("01216", "poo", 7000, "sector2", false)
  var stock5Row2 = new stockRow("01216", "poo", 1000, "sector2", true)
  var stock5Row3 = new stockRow("01216", "poo", 400, "sector1", true)

  var allStock = ArrayBuffer(stock1Row1, stock1Row2, stock1Row3, stock2Row1, stock2Row2, stock3Row1,
    stock3Row2, stock4Row1, stock4Row2, stock5Row1, stock5Row2, stock5Row3)




  //all orders array
  var allOrders = Array(orderForm1, orderForm2, orderForm3, orderForm4, orderForm5, orderForm6, orderForm7, orderForm8, orderForm9)


  def main(args: Array[String]): Unit = {
  }



  println("1)Order information\n2)Stock information\n3)Add stock")
  val firstInput = scala.io.StdIn.readLine()

  firstInput match {
    case "1" =>
      orderInformation

    case "2" =>
      stockInformation

    case "3" =>
      addOrder


  }

  def orderInformation: Unit = {

    println("1)View available orders\n2)Search order by ID")
    var userInput = scala.io.StdIn.readLine()

    userInput match {
      case "1" =>
        viewAvailableOrders()

      case "2" =>
        searchID



    }

  }

  def addOrder: Unit = {



    println("Enter stock ID: ")
    var addStockID = scala.io.StdIn.readLine()

    println("Enter stock name: ")
    var addStockName = scala.io.StdIn.readLine()

    println("Enter quantity: ")
    var addStockQuantity = scala.io.StdIn.readLine()

    println("Enter location: ")
    var addStockLocation = scala.io.StdIn.readLine()

    println("Enter porous state: (true/false)")
    var addStockPorous = scala.io.StdIn.readLine()


    allStock += new stockRow(addStockID, addStockName, addStockQuantity.toInt, addStockLocation, addStockPorous.toBoolean)
    println("\nStock added")


    for (newStock <- allStock) {

      if (newStock.stockID == addStockID) {

        println("\nStock ID: " + newStock.stockID + "\nStock name: " + newStock.stockName + "\nStock quantity: " + newStock.stockQuantity + "\nStock location: " + newStock.stockLocation + "\nStock porous: " + newStock.stockPorous)

      }




    }

  }


  def viewAvailableOrders(): Unit = {
    for (item <- allOrders) {
      if (item.available) {
        println("Order " + item.orderID + " is available")
      }
    }
  }


  def searchID: Unit = {
    println("Enter order ID: ")
    val IdInput = scala.io.StdIn.readLine()
    for (i <- allOrders) {
      var counter = 0
      if ((i.orderID == IdInput) && (i.available == true)) {
        println("\nOrder ID: " + i.orderID + "\nCustomer name: " + i.customerName +
          "\nCustomer address: " + i.customerAddress + "\nOrder status: " +
          i.orderStatus + "\nOrder is available? " + i.available + "\n")

        println("\n1)Process this order?\n2)View porous items\n3)Change location of order\n4)Close application ")





        val choice = scala.io.StdIn.readLine() match {

          case "1" =>

            i.available = false
            i.orderStatus = "processing"

            for (items <- i.orderItems) {
              for (j <- allStock) {
                if (j.stockID == items.itemID && j.stockPorous == items.porousReq) {
                  println("Current stock: " + j.stockQuantity)
                  j.stockQuantity = j.stockQuantity - items.itemQuantity
                  println("New stock: " + j.stockQuantity)
                }
              }
            }
            println("\nOrder ID: " + i.orderID + "\nCustomer name: " + i.customerName +
              "\nCustomer address: " + i.customerAddress + "\nOrder status: " +
              i.orderStatus + "\nOrder is available? " + i.available + "\nOrder location: " + i.orderLocation)


          case "2" =>




              for (row <- i.orderItems) {

                if (IdInput == i.orderID) {

                  if (row.porousReq == true) {

                    println("Item: " + row.itemName + "\n" + "Num of porous req: " + row.itemQuantity)

                  }




                }
              }

          case "3" =>
            println("1)Sector 1\n2)Sector 2\n3)Sector 3\n4)Cancel")

            val locationInput = scala.io.StdIn.readLine() match {





              case "1" =>

                i.orderLocation = "Sector 1"

            println ("\nOrder ID: " + i.orderID + "\nCustomer name: " + i.customerName +
            "\nCustomer address: " + i.customerAddress + "\nOrder status: " +
            i.orderStatus + "\nOrder is available? " + i.available + "\nOrder location: " + i.orderLocation)



              case "2" =>

            i.orderLocation = "Sector 2"

            println ("\nOrder ID: " + i.orderID + "\nCustomer name: " + i.customerName +
            "\nCustomer address: " + i.customerAddress + "\nOrder status: " +
            i.orderStatus + "\nOrder is available? " + i.available + "\nOrder location: " + i.orderLocation)



              case "3" =>

            i.orderLocation = "Sector 3"

            println ("\nOrder ID: " + i.orderID + "\nCustomer name: " + i.customerName +
            "\nCustomer address: " + i.customerAddress + "\nOrder status: " +
            i.orderStatus + "\nOrder is available? " + i.available + "\nOrder location: " + i.orderLocation)

            }


            }







            }

        }







      }



      def stockInformation: Unit = {

        println("1)Search stock by porous\n2)Search stock by ID\n3)Search stock by location\n")
        var stockInput = scala.io.StdIn.readLine()

        stockInput match {
          case "1" =>
            porousSearch

          case "2" =>
            IDsearch

          case "3" =>
            locationSearch
        }


        def porousSearch: Unit = {
          println("1)porous items\n2)non-porous items\n")
          var porousSearchInput = scala.io.StdIn.readLine()

          porousSearchInput match {

            case "1" => porousTrue


            case "2" => porousFalse

          }
        }


        def porousTrue {
          for (porousT <- 0 to allStock.length - 1) {
            if (allStock(porousT).stockPorous == true) {
              println("\nStock ID: " + allStock(porousT).stockID + "\nStock name: " + allStock(porousT).stockName +
                "\nStock quantity: " + allStock(porousT).stockQuantity + "\nLocation: " +
                allStock(porousT).stockLocation + "\nPorous: " + allStock(porousT).stockPorous)
            }
          }
        }

        def porousFalse {
          for (porousF <- 0 to allStock.length - 1) {
            if (allStock(porousF).stockPorous == false) {
              println("\nStock ID: " + allStock(porousF).stockID + "\nStock name: " + allStock(porousF).stockName +
                "\nStock quantity: " + allStock(porousF).stockQuantity + "\nLocation: " +
                allStock(porousF).stockLocation + "\nPorous: " + allStock(porousF).stockPorous)
            }
          }
        }

        def IDsearch(): Unit = {

          println("1)Enter ID: \n")
          var IDSearchInput = scala.io.StdIn.readLine()

          {
            for (i <- 0 to allStock.length - 1) {
              if (allStock(i).stockID == IDSearchInput) {
                println("\nStock ID: " + allStock(i).stockID + "\nStock name: " + allStock(i).stockName +
                  "\nStock quantity: " + allStock(i).stockQuantity + "\nLocation: " +
                  allStock(i).stockLocation + "\nPorous: " + allStock(i).stockPorous)
              }
            }
          }
        }


        def locationSearch: Unit = {

          println("1)sector1\n2)sector2\n3)sector3\n")
          var porousSearchInput = scala.io.StdIn.readLine()

          porousSearchInput match {

            case "1" => sector1Search


            case "2" => sector2Search


            case "3" => sector3Search

          }
        }


        def sector1Search: Unit = {
          for (sector1 <- 0 to allStock.length - 1) {
            if (allStock(sector1).stockLocation == "sector1") {
              println("\nStock ID: " + allStock(sector1).stockID + "\nStock name: " + allStock(sector1).stockName +
                "\nStock quantity: " + allStock(sector1).stockQuantity + "\nLocation: " +
                allStock(sector1).stockLocation + "\nPorous: " + allStock(sector1).stockPorous)
            }
          }
        }



        def sector2Search: Unit = {

          for (sector2 <- 0 to allStock.length - 1) {
            if (allStock(sector2).stockLocation == "sector2") {
              println("\nStock ID: " + allStock(sector2).stockID + "\nStock name: " + allStock(sector2).stockName +
                "\nStock quantity: " + allStock(sector2).stockQuantity + "\nLocation: " +
                allStock(sector2).stockLocation + "\nPorous: " + allStock(sector2).stockPorous)
            }
          }

        }

        def sector3Search: Unit = {

          for (sector3 <- 0 to allStock.length - 1) {
            if (allStock(sector3).stockLocation == "sector3") {
              println("\nStock ID: " + allStock(sector3).stockID + "\nStock name: " + allStock(sector3).stockName +
                "\nStock quantity: " + allStock(sector3).stockQuantity + "\nLocation: " +
                allStock(sector3).stockLocation + "\nPorous: " + allStock(sector3).stockPorous)
            }
          }
        }
      }
    }






