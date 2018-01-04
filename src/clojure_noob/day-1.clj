; (defn jail [num]
;   (if (= num 112)
;     (str "Get 112'd")))
;
; (jail (+ 100 12))
;
; (defn f-all [& names]
;   (map
;    (fn [name]
;      (str "Bless You, " name))
;    names))
;
; (f-all :a :b)
;
; ((fn [x] (* x 3)) 112)
;
; (#(/ % 12) 60)
;
; (map #(str "Hi, " % "!") ["Bee"])
;
; (identity map)

; (defn first-person [[person]]
;   person)
;
; (first-person ["Mary" "Ari"])
;
; (defn list-items [primary & items]
;   (str
;     "These are mostly "
;     primary
;     ". Other than that, they're "
;     (clojure.string/join ", " items)))
;
; (list-items
;   "recall potions"
;   "diamonds"
;   "golds"
;   "and magic wands.")
;
; ; name :name religion :religion}]
; (defn code [{:keys [name lang]}]
;   (if (= lang :clojure)
;     (str "(is-awesome? (" name "))")
;     (str "#define " name " Noob")))
;
; (code {:name "Ali" :lang :js})
; (code {:name "Pmc" :lang :clojure})
;
; (defn swear [name]
;   (str "Rot in Tarnation, " name "!"))
;
; (defn swear-to-all [& people]
;   (map swear people))
; ;
; (swear-to-all "Pmc" "Ali")

; (map inc [0 1 2 3])

; (defn term [name]
;   (str "λ " name))
;
; (defn coords [x y]
;   (str "At (" x ", " y ")"))
;
; (term "cat *.json | jq .scripts")
;
; (coords 559 224)
;
; (defn me
;   ([action room]
;    (str "You are " action " at " room))
;   ([action]
;    (me action :lounge)))
;
; (defn say
;   ([msg room]
;    (str "You said '" msg "' at " room))
;   ([msg]
;    (say msg :lounge)))
;
; (me "eating food")
; (me "sleeping" :home)
;
; (say "Hello, Everyone!")
; (say "Putang Ina Mo..." :home)

; (if true
;   "Truuuue"
;   "NOPE! FALSE!")
;
; (if false
;   (do (str "Nope!")
;     "Sia Zero")
;   (do (str "Crop Top!")
;     "Munich"))
;
; (when true
;   (str "Hello~")
;   (str "World~"))
;
; (nil? nil)
;
; (if nil
;   (str "Impossibru")
;   (str "Tru Dat"))
;
; (or false false nil)
;
; (or false 112 false)
;
; (and true nil false)
;
; (and 1 5 10)
;
; (def prez ["Thaksin" "Prayuth"])
; (def numz [1 1 2 3 5 8 13 21 34 55 89 134])
