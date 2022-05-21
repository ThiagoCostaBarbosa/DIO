import styled from "styled-components";
import { Tab, Tabs, TabList, TabPanel } from "react-tabs";

export const WrapperTab = styled(Tab)`
  border-radius: 16px;
  border: 1px solid #ccc;
  padding: 16px;
  cursor: pointer;
  background: white;

  &:focus {
    outline: none;
  }

  &.is-selected {
    margin: 0 0 -24px;
    padding: 16px;
    border-radius: 16px 16px 0 0;
    border: 1px solid #fff0;
    border-bottom: 1px solid white;
  }
`;

WrapperTab.tabsRole = "Tab";

export const WrapperTabs = styled(Tabs)`
  font-size: 16px;
`;

export const WrapperTabList = styled(TabList)`
  margin: 0 0 8px;
  display: flex;
  gap: 8px;
  list-styled-type: none;
`;

export const WrapperTabPanel = styled(TabPanel)`
  background: #fff;
  display: none;
  padding: 16px;
  box-shadow: 0 0 0.3em #0004;
  border-radius: 16px;

  &.is-selected {
    display: block;
  }
`;

export const WrapperList = styled.div`
display: grid;
grid-template-columns: repeat(auto-fill, minmax(350px, 1fr));
gap: 16px;
`