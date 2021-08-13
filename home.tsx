import React from 'react';
import { View, TouchableOpacity, FlatList, Text, StyleSheet } from 'react-native';
import { useNavigation } from '@react-navigation/native';
import { routes } from './routes';

const styles = StyleSheet.create({
    row: {
        flexDirection: 'row',
        height: 45,
        alignItems: 'center',
        marginLeft: 15,
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
                        <Text>{item.title}</Text>
                    </View>
                </TouchableOpacity>
            );
        }} keyExtractor={item => item.key} />
    );
}



