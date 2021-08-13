import React from 'react';
import { View, TouchableOpacity, FlatList, Text, StyleSheet } from 'react-native';
import { useNavigation } from '@react-navigation/native';
import { routes } from './routes';

const styles = StyleSheet.create({
    row: {
        flexDirection: 'row',
        height: 50,
        alignItems: 'center',
        backgroundColor: 'white',
        justifyContent:'space-between',
        paddingHorizontal: 15,
        borderBottomColor: '#f5f5f5',
    },

    text: {
        fontSize: 15,
        color: '#333333',
    },
});

export const HomeScreen = () => {
    const navigation = useNavigation();
    const list = routes.filter(item => item.key !== 'home');

    return (
        <FlatList data={list} renderItem={({ item }) => {
            return (
                <TouchableOpacity activeOpacity={0.8} onPress={() => navigation.navigate(item.key)}>
                    <View style={styles.row}>
                        <Text style={styles.text}>{item.title}</Text>
                        <Text>{'>'}</Text>
                    </View>
                </TouchableOpacity>
            );
        }} keyExtractor={item => item.key} />
    );
}



