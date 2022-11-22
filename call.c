#include<jni.h>
#include<stdio.h>
#include"call.h"
JNIEXPORT jdouble JNICALL Java_call_add(JNIEnv *env, jobject obj, jdouble a, jdouble b)
{
  return(a+b);
 
}
JNIEXPORT jdouble JNICALL Java_call_sub(JNIEnv *env, jobject obj, jdouble a, jdouble b)
{
  return(a-b);
 
}
JNIEXPORT jdouble JNICALL Java_call_mul(JNIEnv *env, jobject obj, jdouble a, jdouble b)
{
      return (a*b);
}
JNIEXPORT jdouble JNICALL Java_call_div(JNIEnv *env, jobject obj, jdouble a, jdouble b)
{
      return (a/b);
}
