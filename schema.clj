[
;; action entity attributes
{:db/ident :action/request
 :db/valueType :db.type/ref
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}
{:db/ident :action/response
 :db/valueType :db.type/ref
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}
;; sequencing of actions
{:db/ident :action/next
 :db/valueType :db.type/ref
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]
 }


{:db/id #db/id[:db.part/user -2]
  :db/ident :action/root}

;; request entity attributes
{:db/ident :request/op
 :db/valueType :db.type/keyword
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}
{:db/ident :request/data
 :db/valueType :db.type/ref
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}
;; temporary ui hack
{:db/ident :request/ui-id
 :db/valueType :db.type/string
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}


;; response entity attributes
{:db/ident :response/summary
 :db/valueType :db.type/string
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}
{:db/ident :response/status
 :db/valueType :db.type/keyword
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}
{:db/ident :response/resource
 :db/valueType :db.type/ref ;; resource entity is a data entity
 :db/cardinality :db.cardinality/many
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}

;; data entity attributes
{:db/ident :data/edn
 :db/valueType :db.type/string
 :db/cardinality :db.cardinality/one
 :db.install/_attribute :db.part/db :db/id #db/id[:db.part/db]}
]
