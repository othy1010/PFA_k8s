/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Affinity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.NodeAffinity#getRequiredDuringSchedulingIgnoredDuringExecution <em>Required During Scheduling Ignored During Execution</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getNodeAffinity()
 * @model
 * @generated
 */
public interface NodeAffinity extends EObject {
	/**
	 * Returns the value of the '<em><b>Required During Scheduling Ignored During Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required During Scheduling Ignored During Execution</em>' reference.
	 * @see #setRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector)
	 * @see k8s.K8sPackage#getNodeAffinity_RequiredDuringSchedulingIgnoredDuringExecution()
	 * @model required="true" transient="true"
	 * @generated
	 */
	NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution();

	/**
	 * Sets the value of the '{@link k8s.NodeAffinity#getRequiredDuringSchedulingIgnoredDuringExecution <em>Required During Scheduling Ignored During Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required During Scheduling Ignored During Execution</em>' reference.
	 * @see #getRequiredDuringSchedulingIgnoredDuringExecution()
	 * @generated
	 */
	void setRequiredDuringSchedulingIgnoredDuringExecution(NodeSelector value);

} // NodeAffinity
