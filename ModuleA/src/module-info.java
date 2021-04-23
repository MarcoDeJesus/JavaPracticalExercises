module ModuleA{
    //requires java.base;
    //requires transitive ModuleC;
    //exports pkgA to ModuleB;

    exports pkgA;
    requires ModuleB;
    opens pkgA;
}