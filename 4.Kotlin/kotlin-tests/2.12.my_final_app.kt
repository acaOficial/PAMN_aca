fun main() {
    // Variables numéricas
    val userId: Int = 1001
    var userAge: Int = 20

    // Variables de texto (Strings)
    val userName: String = "Acaymo"
    val userEmail: String = "acaymo@gmail.com"


    // Mensaje de bienvenida
    println("¡Bienvenido, $userName!")
    println("Tu ID de usuario es: $userId")
    println("Tu edad es: $userAge años.")
    println("Tu correo electrónico es: $userEmail")

    // Actualización de edad
    userAge += 1
    println("El próximo mes tendrás $userAge años.")


    // Mensaje final
    println("Gracias por usar nuestro servicio, $userName.")
}
