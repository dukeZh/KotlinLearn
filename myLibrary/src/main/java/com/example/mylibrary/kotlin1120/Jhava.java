package com.example.mylibrary.kotlin1120;

import androidx.annotation.Nullable;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;

/**
 * @author duke_zh
 */
public class Jhava {

    //类型映射
    private int hitPoints = 3232320;

    @NotNull
    String utterGreeting() {
        return "Hello";
    }

    @Nullable
    public String determineFriendShipLevel() {
        return null;
    }

    // 属性访问
    public int getHitPoints() {
        System.out.println("-----getHitPoints-----");
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        System.out.println("------setHitPoints----");
        this.hitPoints = hitPoints;
    }

    public void javaUseKotlin() {
        System.out.println(Hero.makeProclamation());

        Spellbook spellbook = new Spellbook();
        //没有使用JvmField
        //spellbook.getSpells();
        //使用JvmField 可以直接用 spellbook.spells
        for (String spell : spellbook.spells) {
            System.out.println(spell);
        }

        //java 支持需要重载（写多个构造函数）
        //可以给kotlin 加上JvmOverloads 使得java 可以重载
        Hero.handOverFood("iphone", "computer");
        Hero.handOverFood("iphone");
        Hero.handOverFood();

        //java 中使用伴生对象
        //没有使用JvmField
        Spellbook.MAX_SPELL_COUNT;
        //没有使用JvmStatic
        Spellbook.Companion.getSpellBookGreeting();
        //使用JvmField
        //System.out.println(Spellbook.MAX_SPELL_COUNT);
        //使用JvmJvmStatic
        // Spellbook.getSpellBookGreeting();

        //异常捕捉@Throws 用法
//        try {
//            //强制在编译器进行处理
//            new Jhava().extendHandInFriendShip();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            Hero.acceptApology();
        } catch (IOException e) {
            System.out.println("Caught");
        }

        //函数类型操作
        Function1<String, Unit> translator = Hero.getTranslator();
        translator.invoke("TRUCE");
    }

    public void extendHandInFriendShip() throws IOException {
        throw new IOException();
    }
}

