package nl.lemkes.template.kotlin

import com.sun.xml.internal.fastinfoset.util.StringArray
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
