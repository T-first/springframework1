#include <jni.h>
#include "HelloWord.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_HelloWorld_sayHello(JNIEnv *env,jobject obj){
printf("Hello World!\n");
return;
}