package ppsus.backend

import org.grails.web.json.JSONObject

class UserController {
    static allowedMethods = [list: "GET"]
    static responseFormats = ['json']

    def list() {
        def user = [
                "nome": "Raul Rosa",
                "login": "Rosinha",
                "tipo": "c"
        ]
        respond user as JSONObject
        return
    }
}
