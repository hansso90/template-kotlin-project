package nl.lemkes.template.kotlin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.info.BuildProperties
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BuildController(
        @Autowired private val buildProperties: BuildProperties
) {

    @RequestMapping("/build")
    fun getBuild() : ResponseEntity<BuildProperties> {
        return ResponseEntity(buildProperties, HttpStatus.OK)
    }
}
