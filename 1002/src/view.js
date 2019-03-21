export const view = () => {
    let _renderContent = '';

    const renderHeader = () => {
        _renderContent += '| Title | Area |\n';
    };

    const renderRow = (rowData) => {
        _renderContent += `| ${rowData.name} | ${rowData.area} |\n`;
    };

    return (data) => {
        renderHeader();
        data.forEach(rowData => renderRow(rowData));
        return _renderContent
    };
};