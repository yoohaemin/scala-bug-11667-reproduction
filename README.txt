[info] Enabling statistics, measuring overhead = 30.9911ns to 169.2693ns per timer
[info] *** Cumulative statistics at phase parser
[info] #created tree nodes           : 4794
[info] *** Cumulative statistics at phase typer
[info] time spent typechecking       : 1 spans, ()2038.956ms
[info] time spent in lubs            : 0 spans, ()0.0ms (0.0%) aggregate, 0.0ms (0.0%) specific
[info] time spent in <:<             : 88665 spans, ()687.628ms (33.7%) aggregate, 601.213ms (29.5%) specific
[info] time spent in findmember      : 37038 spans, ()68.027ms (3.3%) aggregate, 67.708ms (3.3%) specific
[info] time spent in findmembers     : 0 spans, ()0.0ms (0.0%) aggregate, 0.0ms (0.0%) specific
[info] time spent in asSeenFrom      : 17912 spans, ()55.062ms (2.7%) aggregate, 50.999ms (2.5%) specific
[info] time spent in baseTypeSeq     : 1350 spans, ()206.47ms (10.1%) aggregate, 37.936ms (1.9%) specific
[info] time spent in baseClasses     : 176 spans, ()36.695ms (1.8%) aggregate, 18.093ms (0.9%) specific
[info] time classfilereading         : 181 spans, ()170.462ms (8.4%)
[info] time spent in failed          : 199 spans, ()55.027ms (2.7%)
[info]   failed apply                : 0 spans, ()0.0ms (0.0%)
[info]   failed op=                  : 0 spans, ()0.0ms (0.0%)
[info] time spent ref scanning       : 0 spans, ()0.0ms (0.0%)
[info] time spent in implicits       : 1190 spans, ()1187.923ms (58.3%)
[info]   successful in scope         : 396 spans, ()572.524ms (28.1%)
[info]   failed in scope             : 794 spans, ()39.957ms (2.0%)
[info]   successful of type          : 199 spans, ()434.189ms (21.3%)
[info]   failed of type              : 595 spans, ()203.073ms (10.0%)
[info]   assembling parts            : 399 spans, ()17.233ms (0.8%)
[info]   matchesPT                   : 27937 spans, ()496.476ms (24.3%)
[info] time spent in macroExpand     : 0 spans, ()0.0ms (0.0%)
[info] time spent in scope population: 2619 spans, ()2.973ms
[info] #type symbols                 : 27316
[info] #typechecked selections       : 2161
[info] #symbols                      : 56597
[info] #sametype ops                 : 50297
[info] implicits instantiated for pruning: 596
[info]   immediate mismatches        : 198 (33.2%)
[info] #raw type creations           : 57197
[info]   of which in implicits       : 30509 (53.3%)
[info] #class symbols                : 11444
[info] #base type seqs               : 1351
[info] avg base type seq length      : 7.0
[info]   of which for compound types : 164 (12.1%)
[info]   of which for typerefs       : 1186 (87.8%)
[info] #typechecked applications     : 4149
[info] #unique types                 : 8796
[info] #subtype ops                  : 88665
[info]   of which in failed          : 796 (0.9%)
[info]   of which in implicit        : 60835 (68.6%)
[info] #findMember ops               : 37038
[info]   of which not found          : 21244 (57.4%)
[info]   of which multiple overloaded: 396 (1.1%)
[info]   of which in implicit        : 5671 (15.3%)
[info] time spent in scope lookup    : 243136 spans, ()25.483ms
[info] implicit cache accesses       : 794
[info] implicit cache hits           : 395 (49.7%)
[info] #all lubs/glbs                : 793
[info] #created tree nodes           : 38370
[info] #created scopes               : 4896
[info] #typechecked identifiers      : 4539
[info] #implicit searches            : 1190
[info]   #plausibly compatible       : 794 (66.7%)
[info]   #matching                   : 794 (66.7%)
[info]   #typed                      : 794 (66.7%)
[info]   #found                      : 595 (50.0%)
[info]   #implicit improves tests    : 395 (33.2%)
[info]   #implicit inscope hits      : 396 (33.3%)
[info]   #implicit oftype hits       : 199 (16.7%)
[info] *** Cumulative statistics at phase patmat
[info] time spent in scope population: 11803 spans, ()5.766ms
[info] #type symbols                 : 32530
[info] #typechecked selections       : 554131
[info] #symbols                      : 69873
[info] #sametype ops                 : 402687
[info] implicits instantiated for pruning: 596
[info]   immediate mismatches        : 198 (33.2%)
[info] #raw type creations           : 638182
[info]   of which in implicits       : 30509 (4.8%)
[info] #class symbols                : 16246
[info] #base type seqs               : 6116
[info] avg base type seq length      : 8.8
[info]   of which for compound types : 2550 (41.7%)
[info]   of which for typerefs       : 3565 (58.3%)
[info] #typechecked applications     : 9767
[info] #unique types                 : 12024
[info] #subtype ops                  : 5817855
[info]   of which in failed          : 796 (0.0%)
[info]   of which in implicit        : 60835 (1.0%)
[info] #findMember ops               : 48154
[info]   of which not found          : 21645 (44.9%)
[info]   of which multiple overloaded: 396 (0.8%)
[info]   of which in implicit        : 5671 (11.8%)
[info] time spent in scope lookup    : 344226 spans, ()30.603ms
[info] #all lubs/glbs                : 793
[info] #created tree nodes           : 5220333
[info] #created scopes               : 15614
[info] #typechecked identifiers      : 9707
[info] time spent in patmat          : 2 spans, ()25911.688ms
[info]   of which DPLL               : 394 spans, ()16670.677ms (64.3%)
[info]   of which in CNF conversion  : 0 spans, ()0.0ms (0.0%)
[info]   of which variable equality  : 4 spans, ()412.804ms (1.6%)
[info]   of which in exhaustivity    : 0 spans, ()0.0ms (0.0%)
[info]   of which in unreachability  : 2 spans, ()22887.605ms (88.3%)
[info] *** Cumulative statistics at phase erasure
[info] time spent in scope population: 25117 spans, ()8.643ms
[info] #type symbols                 : 38576
[info] #typechecked selections       : 575777
[info] #symbols                      : 83743
[info] #sametype ops                 : 408172
[info] implicits instantiated for pruning: 596
[info]   immediate mismatches        : 198 (33.2%)
[info] #raw type creations           : 650235
[info]   of which in implicits       : 30509 (4.7%)
[info] #class symbols                : 19687
[info] #base type seqs               : 6908
[info] avg base type seq length      : 8.5
[info]   of which for compound types : 2898 (42.0%)
[info]   of which for typerefs       : 4009 (58.0%)
[info] #typechecked applications     : 30515
[info] #unique types                 : 13568
[info] #subtype ops                  : 5931132
[info]   of which in failed          : 796 (0.0%)
[info]   of which in implicit        : 60835 (1.0%)
[info] #findMember ops               : 49862
[info]   of which not found          : 22449 (45.0%)
[info]   of which multiple overloaded: 396 (0.8%)
[info]   of which in implicit        : 5671 (11.4%)
[info] time spent in scope lookup    : 375124 spans, ()33.064ms
[info] #all lubs/glbs                : 793
[info] #created tree nodes           : 5292665
[info] #created scopes               : 30003
[info] #typechecked identifiers      : 24264
[info] *** Cumulative statistics at phase cleanup
[info] time spent in scope population: 25118 spans, ()8.663ms
[info] #type symbols                 : 38588
[info] #typechecked selections       : 575778
[info] #symbols                      : 83869
[info] #sametype ops                 : 408186
[info] implicits instantiated for pruning: 596
[info]   immediate mismatches        : 198 (33.2%)
[info] #raw type creations           : 651990
[info]   of which in implicits       : 30509 (4.7%)
[info] #class symbols                : 19687
[info] #base type seqs               : 6932
[info] avg base type seq length      : 8.5
[info]   of which for compound types : 2912 (42.0%)
[info]   of which for typerefs       : 4019 (58.0%)
[info] #typechecked applications     : 30515
[info] #unique types                 : 13609
[info] #subtype ops                  : 5934126
[info]   of which in failed          : 796 (0.0%)
[info]   of which in implicit        : 60835 (1.0%)
[info] #findMember ops               : 49885
[info]   of which not found          : 22456 (45.0%)
[info]   of which multiple overloaded: 398 (0.8%)
[info]   of which in implicit        : 5671 (11.4%)
[info] time spent in scope lookup    : 375263 spans, ()33.126ms
[info] #all lubs/glbs                : 793
[info] #created tree nodes           : 5293943
[info] #created scopes               : 30027
[info] #typechecked identifiers      : 24264
[error] Error while emitting example/SimpleReproduction$$anonfun$1
[error] Method too large: example/SimpleReproduction$$anonfun$1.applyOrElse (Lorg/http4s/Request;Lscala/Function1;)Ljava/lang/Object;
[info] *** Cumulative statistics at phase jvm
[info] time spent in scope population: 25121 spans, ()8.67ms
[info] #type symbols                 : 38626
[info] #typechecked selections       : 575778
[info] #symbols                      : 85012
[info] #sametype ops                 : 408236
[info] implicits instantiated for pruning: 596
[info]   immediate mismatches        : 198 (33.2%)
[info] #raw type creations           : 652296
[info]   of which in implicits       : 30509 (4.7%)
[info] #class symbols                : 19701
[info] #base type seqs               : 7099
[info] avg base type seq length      : 8.5
[info]   of which for compound types : 3002 (42.3%)
[info]   of which for typerefs       : 4096 (57.7%)
[info] #typechecked applications     : 30515
[info] #unique types                 : 4826
[info] #subtype ops                  : 5934126
[info]   of which in failed          : 796 (0.0%)
[info]   of which in implicit        : 60835 (1.0%)
[info] #findMember ops               : 51866
[info]   of which not found          : 22459 (43.3%)
[info]   of which multiple overloaded: 505 (1.0%)
[info]   of which in implicit        : 5671 (10.9%)
[info] time spent in scope lookup    : 379444 spans, ()33.596ms
[info] time in backend               : 1 spans, ()892884.772ms
[info] bcode initialization          : 1 spans, ()2.645ms (0.0%)
[info] code generation               : 1 spans, ()258.178ms (0.0%)
[info] intra-method optimizations    : 2 spans, ()836311.595ms (93.7%)
[info] classfile writing             : 2 spans, ()0.233ms (0.0%)
[info] #all lubs/glbs                : 793
[info] #created tree nodes           : 5293956
[info] #created scopes               : 30188
[info] #typechecked identifiers      : 24264
[info] *** Cumulative timers for phases
[info] #total compile time           : 1 spans, ()923299.395ms
[info]   parser                      : 1 spans, ()37.989ms (0.0%)
[info]   namer                       : 1 spans, ()3.649ms (0.0%)
[info]   packageobjects              : 1 spans, ()0.04ms (0.0%)
[info]   typer                       : 1 spans, ()2038.973ms (0.2%)
[info]   patmat                      : 1 spans, ()26097.142ms (2.8%)
[info]   superaccessors              : 1 spans, ()64.908ms (0.0%)
[info]   extmethods                  : 1 spans, ()0.415ms (0.0%)
[info]   pickler                     : 1 spans, ()1.066ms (0.0%)
[info]   xsbt-api                    : 1 spans, ()215.205ms (0.0%)
[info]   xsbt-dependency             : 1 spans, ()156.147ms (0.0%)
[info]   refchecks                   : 1 spans, ()204.978ms (0.0%)
[info]   uncurry                     : 1 spans, ()109.853ms (0.0%)
[info]   fields                      : 1 spans, ()52.552ms (0.0%)
[info]   tailcalls                   : 1 spans, ()62.836ms (0.0%)
[info]   specialize                  : 1 spans, ()285.804ms (0.0%)
[info]   explicitouter               : 1 spans, ()66.155ms (0.0%)
[info]   erasure                     : 1 spans, ()643.496ms (0.1%)
[info]   posterasure                 : 1 spans, ()67.513ms (0.0%)
[info]   lambdalift                  : 1 spans, ()79.704ms (0.0%)
[info]   constructors                : 1 spans, ()0.881ms (0.0%)
[info]   flatten                     : 1 spans, ()25.185ms (0.0%)
[info]   mixin                       : 1 spans, ()40.265ms (0.0%)
[info]   cleanup                     : 1 spans, ()45.04ms (0.0%)
[info]   delambdafy                  : 1 spans, ()13.048ms (0.0%)
[info]   jvm                         : 1 spans, ()892884.783ms (96.7%)
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 931 s, completed Aug 8, 2019, 11:26:55 AM
