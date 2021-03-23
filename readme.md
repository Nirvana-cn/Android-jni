通过`AndroidStudio`直接支持`JNI`，这种方法是借助跨平台项目的 CMake

app下build.gradle文件增加如下配置即可

```
externalNativeBuild {
            cmake {
                cppFlags ""
            }
        }

externalNativeBuild {
        cmake {
            path "src/main/cpp/CMakeLists.txt"
            version "3.10.2"
        }
    }
```