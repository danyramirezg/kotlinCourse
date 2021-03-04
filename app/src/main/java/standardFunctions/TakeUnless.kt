package standardFunctions

/*
    Exercise:
    You have a list of client names.
    Using the take function, print out a new list of client names that DON'T start
    with the letter 'A'.

 */

fun main() {
    val clients = listOf("Jero", "Dan", "Eri", "Caro", "Ana", "Andres")
    println(clients)
    val newClients = arrayListOf<String>()

    for (client in clients) {
        client.takeUnless { it[0] == 'A' }
                ?.let {
                    newClients.add(it)
                }
    }
    println(newClients) // [Jero, Dan, Eri, Caro]
}