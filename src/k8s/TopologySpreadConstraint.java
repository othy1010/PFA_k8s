/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Spread Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.TopologySpreadConstraint#getLabelSelector <em>Label Selector</em>}</li>
 *   <li>{@link k8s.TopologySpreadConstraint#getTopologyKey <em>Topology Key</em>}</li>
 *   <li>{@link k8s.TopologySpreadConstraint#getWhenUnsatisfiable <em>When Unsatisfiable</em>}</li>
 *   <li>{@link k8s.TopologySpreadConstraint#getMaxSkew <em>Max Skew</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getTopologySpreadConstraint()
 * @model
 * @generated
 */
public interface TopologySpreadConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Selector</em>' containment reference.
	 * @see #setLabelSelector(LabelSelector)
	 * @see k8s.K8sPackage#getTopologySpreadConstraint_LabelSelector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LabelSelector getLabelSelector();

	/**
	 * Sets the value of the '{@link k8s.TopologySpreadConstraint#getLabelSelector <em>Label Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Selector</em>' containment reference.
	 * @see #getLabelSelector()
	 * @generated
	 */
	void setLabelSelector(LabelSelector value);

	/**
	 * Returns the value of the '<em><b>Topology Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Key</em>' attribute.
	 * @see #setTopologyKey(String)
	 * @see k8s.K8sPackage#getTopologySpreadConstraint_TopologyKey()
	 * @model
	 * @generated
	 */
	String getTopologyKey();

	/**
	 * Sets the value of the '{@link k8s.TopologySpreadConstraint#getTopologyKey <em>Topology Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Key</em>' attribute.
	 * @see #getTopologyKey()
	 * @generated
	 */
	void setTopologyKey(String value);

	/**
	 * Returns the value of the '<em><b>When Unsatisfiable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Unsatisfiable</em>' attribute.
	 * @see #setWhenUnsatisfiable(String)
	 * @see k8s.K8sPackage#getTopologySpreadConstraint_WhenUnsatisfiable()
	 * @model
	 * @generated
	 */
	String getWhenUnsatisfiable();

	/**
	 * Sets the value of the '{@link k8s.TopologySpreadConstraint#getWhenUnsatisfiable <em>When Unsatisfiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Unsatisfiable</em>' attribute.
	 * @see #getWhenUnsatisfiable()
	 * @generated
	 */
	void setWhenUnsatisfiable(String value);

	/**
	 * Returns the value of the '<em><b>Max Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Skew</em>' attribute.
	 * @see #setMaxSkew(int)
	 * @see k8s.K8sPackage#getTopologySpreadConstraint_MaxSkew()
	 * @model
	 * @generated
	 */
	int getMaxSkew();

	/**
	 * Sets the value of the '{@link k8s.TopologySpreadConstraint#getMaxSkew <em>Max Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Skew</em>' attribute.
	 * @see #getMaxSkew()
	 * @generated
	 */
	void setMaxSkew(int value);

} // TopologySpreadConstraint
