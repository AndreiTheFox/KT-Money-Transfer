fun main() {
   val minAmount: Int = 35 //Минимальный перевод в рублях
   val comission: Float = 0.75F //Процент комиссии
   val amount: Int = 3000 //Денежный перевод пользователя в рублях
   val prefix: String = " руб."
   val fee: Float = if (amount > minAmount) amount/100*comission else 0F  //Если перевод больше 35 рублей то считаем комиссию, иначе комиссия = 0
   print(fee)        // Здесь не понял как вывести в одном операторе print и стоимость и название валюты, через операнд + как в Java не работает
   println(prefix)
}