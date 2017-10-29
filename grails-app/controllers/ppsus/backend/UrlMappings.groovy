package ppsus.backend

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        /* user */
        "/user/list"(controller: 'user', action: 'list')

        /* health center */
        "/healthcenter/list"(controller: 'healthCenter', action: 'list')
        "/healthcenter/edit"(controller: 'healthCenter', action: 'edit')
        "/healthcenter/delete"(controller: 'healthCenter', action: 'delete')
        "/healthcenter/create"(controller: 'healthCenter', action: 'create')


    }
}
