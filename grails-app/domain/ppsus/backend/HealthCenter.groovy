package ppsus.backend

import org.grails.datastore.mapping.query.Query

class HealthCenter {
    Integer id
    String name
    String address
    String neighborhood
    Integer number
    String cep
    String phone

    static hasMany = [
            users: User
    ]
    static constraints = {
        name size: 5..100
        address size: 5..100
        neighborhood size: 5..100
        cep size: 8..8
        phone size: 8..8
    }

}
